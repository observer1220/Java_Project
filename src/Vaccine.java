import javax.swing.*;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含AZ, BNT, Moderna, Janssen): ");
        vaccine = vaccine.toLowerCase();

        switch (vaccine) {
            case "az" ->
                    JOptionPane.showMessageDialog(null, "AZ\n研發國:英國、瑞典\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:81%");
            case "bnt" ->
                    JOptionPane.showMessageDialog(null, "BNT\n研發國:美國\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:100%");
            case "moderna" ->
                    JOptionPane.showMessageDialog(null, "Moderna\n研發國:美國\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:100%");
            case "janssen" ->
                    JOptionPane.showMessageDialog(null, "Janssen\n研發國:美國\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:100%");
            default -> JOptionPane.showMessageDialog(null, "無法辨識輸入內容，請重新輸入");
        }
    }
}
