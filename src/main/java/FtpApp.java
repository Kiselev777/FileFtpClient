import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtpApp {

    public static void main(String[] args) throws IOException {
        if (args.length<4){
            System.out.println("Format parse failed. Input format: server port user password");
            return;
        }
        String server = args[0];
        if (server == null || server.isEmpty()) {
            System.out.println("Failed to parse server name");
            return;
        }
        int port;
        try {
            port = Integer.parseInt(args[1]);
        } catch (Exception e ) {
            System.out.println("Failed to parse port");
            return;
        }
        String user = args[2];
        if (user == null || user.isEmpty()) {
            System.out.println("Failed to parse server name");
        }
        String password = args[3];
        if (password == null || password.isEmpty()) {
            System.out.println("Failed to parse server name");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FtpClient ftp=new FtpClient(server,port,user,password);
        ftp.open();
        System.out.println("Enter source and destination");
        try {
            String source= reader.readLine();
            String destination=reader.readLine();
            ftp.downloadFile(source,destination);
        } catch (IOException e) {
            System.out.println("Error source or destination");
        }

    }
}
