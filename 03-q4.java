
public class q4 {

	public static void main(String [] args) {
		int pencils = 534;
		int students = 30;
		
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		// ���� ���� ��
		int pencilLeft = (pencils - (students * pencilsPerStudent));
		System.out.println(pencilLeft);
	}
}
