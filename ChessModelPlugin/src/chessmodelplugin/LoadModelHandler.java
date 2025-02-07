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

public class LoadModelHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        
        FileDialog dialog = new FileDialog(shell, SWT.OPEN);
        dialog.setFilterExtensions(new String[] { "*.xmi", "*.*" });
        dialog.setFilterNames(new String[] { "XMI Files (*.xmi)", "All Files (*.*)" });
        
        String filePath = dialog.open();
        
        if (filePath != null) {
            File file = new File(filePath);
            
            try {
                Game gameInstance = ChessModelUtil.loadModel(file);
                CreateFirstGameHandler.setGameInstance(gameInstance); 
                
                MessageDialog.openInformation(shell, "Chess Model", "Model loaded successfully from " + file.getAbsolutePath());
            } catch (IOException e) {
                throw new ExecutionException("Error loading model", e);
            }
        } else {
            MessageDialog.openInformation(shell, "Load Cancelled", "Load operation was cancelled.");
        }

        return null;
    }
}
