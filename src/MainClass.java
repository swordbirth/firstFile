
public class MainClass {

	public static void main(String[] args) {
		CargoBoat ship = new CargoBoat();
		ship.setMaxContent(1000);
		int a;
		a = 600;
		try{
			ship.loading(a);
			a = 400;
			ship.loading(a);
			a = 367;
			ship.loading(a);
			a = 555;
			ship.loading(a);
		}
		catch(DangerException e){
			System.out.println(e.warnMess());
			System.out.println("�޷�װ��������"+a+"�ֵļ�װ��");
		}
		finally{
			System.out.println("������������");
		}
	}

}
