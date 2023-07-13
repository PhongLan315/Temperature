package temperature;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
public class TempConverterController implements ActionListener{
    //field
    private TempConverterGUI viewRemote;

    //constructor
    public TempConverterController(){

    }

    //method

    /**
     * @param viewRemote
     */
    public TempConverterController(TempConverterGUI viewRemote) {
        this.viewRemote = viewRemote;
    }

    /**
     * @param viewRemote the viewRemote to set
     */
    public void setViewRemote(TempConverterGUI viewRemote) {
        this.viewRemote = viewRemote;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //lấy dữ liệu từ Boundary 
        //fah, cel TExtField
        //truy cập celTExt , fahTExtField bên view
        JTextField celTextFieldRemote = viewRemote.getCelTextFieldRemote();

        JTextField fahTextFieldRemote = viewRemote.getFahTextFieldRemote();

        double cel = Double.parseDouble(celTextFieldRemote.getText());
        double fah = Double.parseDouble(fahTextFieldRemote.getText());

        //model????
        TempConverter modelRemote = viewRemote.getModelRemote();

        //chuyển dữ liệu cho Model
        modelRemote.setCel(cel);
        modelRemote.setFah(fah);

        if(e.getSource() == celTextFieldRemote){
            //gửi message cho Entity/Model để chuyển từ c=>f
            double newF;
            newF = modelRemote.c2f();
            //cập nhật lại giao diện fahTextField
            fahTextFieldRemote.setText("" + newF);
        }else{
            double newC;
            newC = modelRemote.f2c();


            //cập nhật
            celTextFieldRemote.setText("" + newC);
        }
    }
    
}