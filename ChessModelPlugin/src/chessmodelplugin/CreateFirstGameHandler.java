package chessmodelplugin;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import chess.Game;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class CreateFirstGameHandler extends AbstractHandler {

    private static Game gameInstance;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        gameInstance = ChessModelUtil.createFirstChessGame();
        
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        MessageDialog.openInformation(shell, "Chess Model", "Chess game model created successfully.");

        return null;
    }

    public static Game getGameInstance() {
        return gameInstance;
    }
    
    public static void setGameInstance(Game game_instance) {
        gameInstance = game_instance;
    }
}

