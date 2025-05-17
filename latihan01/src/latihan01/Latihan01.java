
package latihan01;
import java.sql.Statement; 
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Antonia Tatarianingsih Abur
 * TGl, 17 Mei 2025
 */
public class Latihan01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        dbkoneksi dbk = new dbkoneksi();
        
        Statement stm = dbk.koneksi().createStatement();
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = stm.executeQuery(sql);
        
        while( rs.next() ){
            System.out.println("Nama : " + rs.getString("NAMA"));
            System.out.println("NIM : " + rs.getString("NIM"));
            System.out.println("PRODI : " + rs.getString("PRODI"));
            System.out.println("JKEL : " + rs.getString("JKEL"));
            
        }
    }
    
}
