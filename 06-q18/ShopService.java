package q18;

public class ShopService {

	/*
	 * ShopService ��ü�� �̱������� ����� �ͽ��ϴ�. 
	 * ShopServiceExample Ŭ�������� ShopService�� getInstance() �޼ҵ�� �̱����� ���� �� �ֵ��� 
	 * ShopService Ŭ������ �ۼ��غ�����.
	 */
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	static ShopService getInstance() {
		return shopservice;
	}
}
