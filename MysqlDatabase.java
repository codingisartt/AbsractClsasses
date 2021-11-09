public class MysqlDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("Mysql updated....");
		
	}

	@Override
	void get() {
		System.out.println("Mysql got the data...");
		
	}

}