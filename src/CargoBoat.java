
public class CargoBoat {
	int realContent;
	int MaxContent;
	public void setMaxContent(int a){
		MaxContent = a;
	}
	public void loading(int a) throws DangerException{
		realContent += a;
		if(realContent>MaxContent){
			throw new DangerException();
		}
		System.out.println("目前装载了"+realContent+"吨货物");
	}

}
