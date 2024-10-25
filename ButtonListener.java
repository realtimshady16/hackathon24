import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class ButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "default";
        if(e.getActionCommand().equals("bursaries")){
            url = "https://www.zabursaries.co.za/";
        }else if(e.getActionCommand().equals("work")) url = "https://www.graduates24.com/internshipprogrammes";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }

    }

}
