package application;

public class TestUnit {
	public static void main(String []args) {
		Employee budi = new Employee("Budi", 100.0);
        ComissionedEmployee susi = new ComissionedEmployee("Susi", 100.0, 300.0);
        
		System.out.println("Nama : " + budi.getName() + "(" + budi.getClass().getName() + ")");
		System.out.println("Gaji : " + budi.getSalary());
		System.out.println("Pjak : " + budi.getTax());
		System.out.println("Gabi : " + budi.getTakeHomePay());
        System.out.println();
		System.out.println("Nama : " + susi.getName() + "(" + susi.getClass().getName() + ")");
		System.out.println("Gaji : " + susi.getSalary());
		System.out.println("Komi : " + susi.getComission());
		System.out.println("Pjak : " + susi.getTax());
		System.out.println("Gabi : " + susi.getTakeHomePay());
	}
}