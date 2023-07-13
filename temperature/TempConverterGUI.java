package temperature;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TempConverterGUI extends JPanel{
    //field
    private String title;
    private JLabel celLabelRemote, fahLabelRemote;
    private JTextField celTextFieldRemote, fahTextFieldRemote;

    //controller
    private TempConverterController controllerRemote;
    //model
    private TempConverter modelRemote;

    //constructor
    public TempConverterGUI(){
        //ASSO
        controllerRemote = new TempConverterController(this);

        //COMPO
        modelRemote = new TempConverter();

        title = "Temperature Converter";
        celLabelRemote = new JLabel("Celsius");
        fahLabelRemote = new JLabel("Fahrenheit");

        //dang ký đối tượng lắng nghe
        celTextFieldRemote = new JTextField("0.0", 10);
        celTextFieldRemote.addActionListener(controllerRemote);
        fahTextFieldRemote = new JTextField("32.0", 10);
        fahTextFieldRemote.addActionListener(controllerRemote);

        //dua vao Panel
        add(celLabelRemote);
        add(celTextFieldRemote);
        add(fahLabelRemote);
        add(fahTextFieldRemote);
    }

    //methods
    public void display(){
        JFrame jFrameRemote = new JFrame(title);
        //dua Panel vao JFrame
        jFrameRemote.add(this);
        jFrameRemote.pack();//FIT SIZE
        //dong cua so => thoat
        jFrameRemote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameRemote.setVisible(true);//hien hinh

    }
    public JTextField getCelTextFieldRemote() {
        return celTextFieldRemote;
    }
    public JTextField getFahTextFieldRemote() {
        return fahTextFieldRemote;
    }
    public TempConverter getModelRemote() {
        return modelRemote;
    }
}
