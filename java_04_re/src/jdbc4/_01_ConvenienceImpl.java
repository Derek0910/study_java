package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class _01_ConvenienceImpl implements _01_ConvenienceDAO{
	
	//디폴트 생성자
	private _01_ConvenienceImpl(){};
	
	//인스턴스
	 static _01_ConvenienceImpl instance = new _01_ConvenienceImpl();
	
	
	 public static _01_ConvenienceImpl getInstance() {
		 if(instance==null) {
			 instance = new _01_ConvenienceImpl();
		 }
		 return instance;
	 }
	
	Scanner scan = new Scanner(System.in);
	 
	Connection conn = null; 
	PreparedStatement psmt = null;
	ResultSet rs = null; 
	
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbId = "scott_04";
	String dbPassword = "tiger";
	
	@Override
	public int itemReg(_01_ItemDTO idto) {
		int regCnt = 0;
		
		System.out.println("추가할 아이템의 번호를 설정해 주세요.");
		idto.setItmeno(scan.nextInt());
		scan.nextLine();
		
		System.out.println("추가할 아이템의 이름을 입력해 주세요.");
		idto.setItemname(scan.next());
		scan.nextLine();
		
		System.out.println("추가할 아이템의 수량를 설정해 주세요.");
		idto.setItem_quantity(scan.nextInt());
		scan.nextLine();
		
		System.out.println("추가할 아이템의 제조사를 입력해 주세요.");
		idto.setManufacturer(scan.next());
		scan.nextLine();
		
		String query = "INSERT INTO jdbc_convinience_tbl "
				+ " VALUES(?, ?, ?, ?)";
		
		try {
			Connection conn=DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, idto.getItmeno());
			psmt.setString(2, idto.getItemname());
			psmt.setInt(3, idto.getItem_quantity());
			psmt.setString(4, idto.getManufacturer());
			
			regCnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return regCnt;
	}
	
	
	@Override
	public _01_ItemDTO itemSelect(_01_ItemDTO idto) {
		int selectCnt= 0;
		String query = "SELECT * "
					 + " FROM jdbc_convinience_tbl "
					 + " WHERE itemname = ? ";
		
		System.out.println("조회할 아이템의 이름을 입력해 주세요.");
		idto.setItemname(scan.next());
		scan.nextLine();
		
		try {
			Connection conn=DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			
//			selectCnt = psmt
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		return idto;
	}
	
	
	@Override
	public int itemDelete(_01_ItemDTO idto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public _01_OrderDTO itemOrder(_01_OrderDTO iodto) {
		// TODO Auto-generated method stub
		return null;
	}	

}
