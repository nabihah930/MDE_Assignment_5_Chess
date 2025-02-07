package chessmodelplugin;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import chess.Game;

import java.io.File;
import java.io.IOException;

public class SaveModelHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Game gameInstance = CreateFirstGameHandler.getGameInstance();
        
        if (gameInstance == null) {
        	gameInstance = CreateSecondGameHandler.getGameInstance();
        }

        if (gameInstance == null) {
            Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
            MessageDialog.openError(shell, "Error", "No chess model to save. Please create a model first.");
            return null;
        }

        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        
        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
        dialog.setFilterExtensions(new String[] { "*.xmi", "*.*" });
        dialog.setFilterNames(new String[] { "XMI Files (*.xmi)", "All Files (*.*)" });
        dialog.setFileName("chessGameInstance.xmi");
        
        String filePath = dialog.open();
        
        if (filePath != null) {
            File file = new File(filePath);
            
            try {
                ChessModelUtil.saveModel(gameInstance, file);
                MessageDialog.openInformation(shell, "Chess Model", "Model saved successfully to " + file.getAbsolutePath());
            } catch (IOException e) {
                throw new ExecutionException("Error saving model", e);
            }
        } else {
            MessageDialog.openInformation(shell, "Save Cancelled", "Save operation was cancelled.");
        }

        return null;
    }
}
