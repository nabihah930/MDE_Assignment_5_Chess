package chessmodelplugin;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import chess.Game;

import org.eclipse.emf.common.util.Diagnostic;

public class ValidateModelHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Game gameInstance = CreateFirstGameHandler.getGameInstance();

        if (gameInstance == null) {
            gameInstance = CreateSecondGameHandler.getGameInstance();
        }

        if (gameInstance == null) {
            showErrorDialog("No chess model to validate. Please create or load a model first.");
            return null;
        }

        Diagnostic diagnostic = ChessModelUtil.validateModel(gameInstance);

        if (diagnostic.getSeverity() == Diagnostic.OK) {
            showInfoDialog("Chess model is valid.");
        } else {
            showErrorDialog(collectErrorMessages(diagnostic));
        }

        return null;
    }

    private void showErrorDialog(String message) {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        MessageDialog.openError(shell, "Validation", message);
    }

    private void showInfoDialog(String message) {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        MessageDialog.openInformation(shell, "Validation", message);
    }

    private String collectErrorMessages(Diagnostic diagnostic) {
        StringBuilder errorMessages = new StringBuilder();
        if (diagnostic.getMessage() != null && !diagnostic.getMessage().isEmpty()) {
            errorMessages.append(diagnostic.getMessage()).append("\n");
        }
        for (Diagnostic child : diagnostic.getChildren()) {
            if (child.getMessage() != null && !child.getMessage().isEmpty()) {
                errorMessages.append(child.getMessage()).append("\n");
            }
        }
        return errorMessages.toString();
    }
}
