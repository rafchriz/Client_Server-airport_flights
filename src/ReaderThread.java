import java.io.IOException;

public class ReaderThread extends Thread {

	String[] args;

	public void run(){
		
	  	  String[] args = new String[] {"1234"};

    		try {
				ReaderClient.main(args);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
  }