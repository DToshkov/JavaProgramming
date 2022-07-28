import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits {
    public static void main(String[] args) {
        Path fileIn = Paths.get("/root/sandbox/AcctNumsIn.txt");
        Path fileOut = Paths.get("/root/sandbox/AcctNumsOut.txt");

        String acct, newline = "\n";
        int acctnum,lastDigit, digit, sum, x;
        
        try{
        	InputStream input = Files.newInputStream(fileIn);
        	BufferedReader reader = new BufferedReader (new InputStreamReader(input));
        	OutputStream output = Files.newOutputStream(fileOut);
        	
        	acct = reader.readLine();
        	while(acct != null) {
        		sum = 0;
        		acctnum = Integer.parseInt(acct);
        		lastDigit = acctnum % 10;
        		acctnum = acctnum / 10;
        		
        		for( x = 0; x < 6; x++)
        		{
        			digit = acctnum % 10;
        			sum = sum + digit;
        			acctnum = acctnum/10;
        		}
        		sum = sum % 10;
                System.out.println(sum + " " + lastDigit);
                if(sum == lastDigit) 
        		{
        			System.out.println(acct + " is valid ");
        			acct += System.getProperty("line.separator");
        			byte[] data = acct.getBytes();
        			output.write(data);
        		}
        		else {
        			System.out.println(acct + " is not valid ");
        		}
                acct = reader.readLine();
        		}
                input.close();
                output.close();
        }
        catch(IOException e) 
        {
        	System.out.println(e);
        }
        
    }
}

