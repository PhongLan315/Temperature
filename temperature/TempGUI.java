



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//kế thừa panel để hiện thị panel
public class TempGUI extends JPanel {

    //field
    private String tile;
    private JLabel CLabelRemote, FLabelRemote;
    private JTextField CTextRemote, FTextRemote;

    //controller
    private TempController controllerRemote;
    //khai báo model
    private TempModel modelRemote;
    //constructor
    public TempGUI() {
        //asso
        controllerRemote = new TempController(this);

        //compo
        modelRemote = new TempModel();

        tile = "Temp convert (inner class)";
        CLabelRemote = new JLabel("celsius");
        FLabelRemote = new JLabel("Fahrenheit");
        
        //register the ActionListner
        CTextRemote = new JTextField("0.0",10);
        CTextRemote.addActionListener(controllerRemote);
        FTextRemote = new JTextField("32.0",10);
        FTextRemote.addActionListener(controllerRemote);


        //add into panel
        add(CLabelRemote);
        add(CTextRemote);
        add(FLabelRemote);
        add(FTextRemote);

    }
    

    //method
    public void display() {
        JFrame jframRemote = new JFrame(tile);

        //add panel to frame
        jframRemote.add(this);
        jframRemote.pack();//fit size
        jframRemote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframRemote.setVisible(true);

    }


    //get and set
    public JTextField getCTextRemote() {
        return CTextRemote;
    }

    public JTextField getFTextRemote() {
        return FTextRemote;
    }

    public TempModel getModelRemote() {
        return modelRemote;
    }
    



    //class Temppcontroller 
    //Temppcontroller inside model
    class TempController implements ActionListener {

        //field
        private TempGUI viewGuiRemote;


        //constructor
        public TempController() {
          
        }

        public TempController(TempGUI viewGuiRemote) {
            this.viewGuiRemote = viewGuiRemote;
        }


        public void setViewGuiRemote(TempGUI viewGuiRemote) {
            this.viewGuiRemote = viewGuiRemote;
        }

        //method
        @Override
        public void actionPerformed(ActionEvent e) {
            //lấy dữ liệu từ GUI
            //fah, cel text
            //truy cập fah, cel text trong GUI
            JTextField celTxt = viewGuiRemote.getCTextRemote();
            JTextField fahTxt = viewGuiRemote.getFTextRemote();

            //đổi texext => double
            double cel = Double.parseDouble(celTxt.getText());
            double fah = Double.parseDouble(fahTxt.getText());
            

            //gọi model để sử dụng các method chuyển đổi
            TempModel modelRemote = viewGuiRemote.getModelRemote();
            
            //chuyển dữ liệu cho model
            modelRemote.setCel(cel);
            modelRemote.setFah(fah);

            if (e.getSource() == celTxt) {
                //gửi message cho Entity/Model chuyển c->f
                double newF;
                newF = modelRemote.c2f();
                fahTxt.setText(""+newF);
            } else {
                double newC;
                newC = modelRemote.f2c();
                celTxt.setText(""+newC);
            }
        }





    }



}