import java.io.*;

public class lab9 {
    public static boolean validateCredentials(String username, String password, String credentialsFile) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(credentialsFile))){
            String line;
            while((line=br.readLine())!=null){
                String fileUsername = line.trim();
                String filePassword = br.readLine().trim();
                if(fileUsername.equals(username) && filePassword.equals(password)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void writeToFile(String filename, String content) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            bw.write(content);
        }
    }

    public static void main(String[] args){
        if(args.length<5){
            System.out.println("Usage: <credentialsFile> <username> <password> <outputFile> <content>");
            System.exit(1);
        }

        String credentialsFile = args[0];
        String username = args[1];
        String password = args[2];
        String outputFile = args[3];
        StringBuilder content = new StringBuilder();
        for(int i=4; i<args.length; i++){
            content.append(args[i]).append(" ");
        }

        try{
            if(validateCredentials(username, password, credentialsFile)){
                writeToFile(outputFile, content.toString());
                System.out.println("Content written to "+outputFile);
            }else{
                System.out.println("Invalid username or password.");
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
