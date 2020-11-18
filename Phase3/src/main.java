import java.sql.*;
import java.util.Scanner;
import member.*;
import menu.*;


public class main {
    /*
     * 1. 로그인 콘솔 -> 1 - 로그인, 2 - 관리자 로그인 ,3 - 회원가입
     *  1.1) 정보 수정, 비밀번호 수정 ( ID수정 불가능 ), 회원 탈퇴
     *  1.2) 영상물 등록 및 정보 수정 가능
     *  1.3) signUp class
     *
     * 2. 영상물 콘솔 -> 1. 조회, 2. 검색,
     *  2.1)
     *  2.2) 제목검색, 조건검색, 영상물 정보 확인, 영상물 평가
     *       -> 평가한 영상물은 검색대상에서 제외
     *
     *
     * */
    static Connection conn = null;
    static Statement st = null;

    static String url = "jdbc:postgresql://localhost/phase2";
    static String user = "postgres";
    static String password = "dlwjdduf1!";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        /* Make onnection with Database */
        conn = DriverManager.getConnection(url, user, password);
        st = conn.createStatement();

        /* signIn object */
        Signin sin = new Signin(Account.getInstance());
        /* menu interface object */
        Menu menu = new Menu(Account.getInstance());

        Account account = Account.getInstance(); // Singleton pattern
        // 가장 처음에 애플리케이션 시작 시 login 실행
        menu.start(st);

        System.out.println(account.getAcc_id());
    // oHm184U1

//        rs = st.executeQuery("SELECT * FROM \"knuMovie\".\"ACCOUNT\"");
//        while (rs.next())
//            System.out.println(
//                    rs.getString(1) + ' ' +
//                            rs.getString(2) + ' ' +
//                            rs.getString(3) + ' ' +
//                            rs.getString(4) + ' ' +
//                            rs.getDate(5) + ' ' +
//                            rs.getInt(6) + ' ' +
//                            rs.getString(7) + ' ' +
//                            rs.getString(8) + ' ' +
//                            rs.getString(9) + ' ' +
//                            rs.getString(10) + ' ' +
//                            rs.getBoolean(11));
    }
}
