public class Main {

	public static void main(String[] args) {//Abstract Classes do not produce objects like interfaces, but it can be assigned to the following class.
		AbstractDatabase abstractDatabase1 = new MysqlDatabase();
		AbstractDatabase abstractDatabase2 = new MongoDatabase();
		
		abstractDatabase1.add();
		abstractDatabase2.update();

	}

}