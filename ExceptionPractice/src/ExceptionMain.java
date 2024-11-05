import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {

public static void main(String[] args)	{
		try {
			System.out.println("Reading from file:" + args[0]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("未輸入讀取檔案名稱,程式結束");
			System.exit(0);
		}
		
		try (BufferedReader b = new BufferedReader(new FileReader(args[0]))){
		String s = null;
		while((s = b.readLine()) != null) {
		System.out.println(s);
		}
		}catch(FileNotFoundException ex) {
		System.err.println("檔案不存在:"+args[0]);	
		}catch(IOException ex) {
		System.err.println("檔案讀取失敗"+ex.getMessage());	
		}
		

}
}
