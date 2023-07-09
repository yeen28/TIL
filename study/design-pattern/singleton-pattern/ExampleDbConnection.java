/**
 * DAO (Data Access Object) : DBMS에 대한 작업
 * 자세한 코드 => yeen28 repository의 edu/dao/DbConnection.java
 * @author user
 */
public class ExampleDbConnection {  // Singleton Pattern
	private static ExampleDbConnection psDAO;

	private ExampleDbConnection() {
	} //PreparedStatementDAO

	public static ExampleDbConnection getInstance() {
		if(psDAO == null) {
			psDAO = new ExampleDbConnection();
		}//end if
		return psDAO;
	}//getInstance
} //class