package week1.day3;

public class Mobile {
	
	public void sendmessage() {
		System.out.println("send message");
	}
	public void senddocument() {
		System.out.println("send document");
	}
	public void call() {
		System.out.println("call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile obj = new Mobile();
        	obj.call();
        	obj.sendmessage();
        	obj.senddocument();
        	
	}

}
