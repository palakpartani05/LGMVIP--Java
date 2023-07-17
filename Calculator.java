import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener
{
    double n1=0,n2=0,result=0;
    int calculation;
    JFrame frame = new JFrame("Calculator");
    JTextField text = new JTextField();
    JLabel label = new JLabel();
    JPanel panel;
    JButton b00,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton badd,bsub,bmul,bdiv,beq,bclr,bdot,bdel,bsq,bsqrt,brp,bsin,bcos,btan,blog,bexp,bfac,bbrac1,bbrac2,bpi,bcube;
    JRadioButton radioOn = new JRadioButton("on");
    JRadioButton radioOff = new JRadioButton("off");
    ImageIcon icon = new ImageIcon("cal1.png");
    
    Calculator()
    {
        prepareFrame();
        addComponent();
        addActionEvent();
    }
    public void prepareFrame()
    {
        frame.setSize(385,540);
        frame.setLocation(500, 200);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.getContentPane().setLayout(null);
        frame.setVisible((true));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
    }
    public void addComponent()
    {
        label.setBounds(250, 0, 60, 60);
        label.setForeground(Color.WHITE);
        frame.add(label);

        //textfield
        text.setBounds(10, 40, 350, 50);
        text.setFont(new Font("Arial",Font.BOLD,20));
        text.setEditable(false);
        text.setBackground(Color.white);
        text.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(text);

        //radiobutton
        radioOn.setBounds(300,100,60,40);
        radioOn.setSelected(true);
        radioOn.setFont(new Font("Arial", Font.BOLD, 14));
        radioOn.setBackground(Color.black);
        radioOn.setForeground(Color.white);
        radioOn.setFocusable(false);
        frame.add(radioOn);

        radioOff.setBounds(300,130,60,40);
        radioOff.setSelected(true);
        radioOff.setFont(new Font("Arial", Font.BOLD, 14));
        radioOff.setBackground(Color.black);
        radioOff.setForeground(Color.white);          
        radioOff.setFocusable(false);
        frame.add(radioOff);


        // buttons

        b7=new JButton("7");     
        b7.setBounds(220, 230, 60, 40);
        b7.setFont(new Font("Arial", Font.BOLD, 20));
        b7.setFocusable(false);
        frame.add(b7);

        b8=new JButton("8");
        b8.setBounds(80,230,60,40);
        b8.setFont(new Font("Arial", Font.BOLD, 20));
        b8.setFocusable(false);
        frame.add(b8);

        b9=new JButton("9");
        b9.setBounds(150,230,60,40);
        b9.setFont(new Font("Arial", Font.BOLD, 20));
        b9.setFocusable(false);
        frame.add(b9);

        b4=new JButton("4");
        b4.setBounds(80,290,60,40);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setFocusable(false);
        frame.add(b4);

        b5=new JButton("5");
        b5.setBounds(150,290,60,40);
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setFocusable(false);
        frame.add(b5);

        
        b6=new JButton("6");
        b6.setBounds(220,290,60,40);
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setFocusable(false);
        frame.add(b6);

        b1=new JButton("1");
        b1.setBounds(80,350,60,40);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setFocusable(false);
        frame.add(b1);

        b2=new JButton("2");
        b2.setBounds(150,350,60,40);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setFocusable(false);
        frame.add(b2);

        
        b3=new JButton("3");
        b3.setBounds(220,350,60,40);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setFocusable(false);
        frame.add(b3);

        b00=new JButton("00");
        b00.setBounds(80, 410, 60, 40);
        b00.setFont(new Font("Arial", Font.BOLD, 20));
        b00.setFocusable(false);
        frame.add(b00);

        b0=new JButton("0");
        b0.setBounds(150, 410, 60, 40);
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b0.setFocusable(false);
        frame.add(b0);

        bdot=new JButton(".");
        bdot.setBounds(220, 410, 60, 40);
        bdot.setFont(new Font("Arial", Font.BOLD, 20));
        bdot.setFocusable(false);
        frame.add(bdot);

        bsqrt=new JButton("\u221A");
        bsqrt.setBounds(220, 170, 60, 40);
        bsqrt.setFont(new Font("Arial", Font.BOLD, 20));
        bsqrt.setFocusable(false);
        frame.add(bsqrt);

        bsq=new JButton("x\u00B2");
        bsq.setBounds(80, 170, 60, 40);
        bsq.setFont(new Font("Arial", Font.BOLD, 20));
        bsq.setFocusable(false);
        frame.add(bsq);
    
        brp=new JButton("<html>1/x</html>");
        brp.setBounds(150, 170, 60, 40);
        brp.setFont(new Font("Arial", Font.BOLD, 20));
        brp.setFocusable(false);
        frame.add(brp);

        bclr=new JButton("C");
        bclr.setBounds(80, 110, 60, 40);
        bclr.setFont(new Font("Arial", Font.BOLD, 20));
        bclr.setBackground(Color.red);
        bclr.setForeground(Color.black);
        bclr.setFocusable(false);
        frame.add(bclr);

        bdel = new JButton("<html>Del</html>");
        bdel.setBounds(150, 110, 61, 40);
        bdel.setFont(new Font("Arial", Font.BOLD, 20));
        bdel.setBackground(Color.red);
        bdel.setForeground(Color.black);
        bdel.setFocusable(false);
        frame.add(bdel);

        bdiv=new JButton("/");
        bdiv.setBounds(10, 110, 60, 40);
        bdiv.setFont(new Font("Arial", Font.BOLD, 20));
        bdiv.setBackground(Color.yellow);
        bdiv.setForeground(Color.black);
        bdiv.setFocusable(false);
        frame.add(bdiv);

        bsub=new JButton("-");
        bsub.setBounds(10, 170, 60, 40);
        bsub.setFont(new Font("Arial", Font.BOLD, 25));
        bsub.setBackground(Color.yellow);
        bsub.setForeground(Color.black);
        bsub.setFocusable(false);
        frame.add(bsub);

        bmul=new JButton("*");
        bmul.setBounds(10,230,60,40);
        bmul.setFont(new Font("Arial", Font.BOLD, 20));
        bmul.setBackground(Color.yellow);
        bmul.setForeground(Color.black);
        bmul.setFocusable(false);
        frame.add(bmul);

        badd=new JButton("+");
        badd.setBounds(10,290,60,40);
        badd.setFont(new Font("Arial", Font.BOLD, 20));
        badd.setBackground(Color.yellow);
        badd.setForeground(Color.black);
        badd.setFocusable(false);
        frame.add(badd);

        beq=new JButton("=");
        beq.setBounds(10, 350, 60, 100);
        beq.setFont(new Font("Arial", Font.BOLD, 20));
        beq.setBackground(Color.yellow);
        beq.setForeground(Color.black);
        beq.setFocusable(false);
        frame.add(beq);

        blog=new JButton("<html>Log</html>");
        blog.setBounds(220, 110, 60, 40);
        blog.setFont(new Font("Arial", Font.BOLD, 20));
        blog.setBackground(Color.red);
        blog.setForeground(Color.black);
        blog.setFocusable(false);
        frame.add(blog);

        bsin=new JButton("<html>Sin</html>");
        bsin.setBounds(290, 170, 70, 40);
        bsin.setFont(new Font("Arial", Font.BOLD, 20));
        bsin.setBackground(Color.yellow);
        bsin.setForeground(Color.black);
        bsin.setFocusable(false);
        frame.add(bsin);

        bcos=new JButton("<html>Cos</html>");
        bcos.setBounds(290, 230, 70, 40);
        bcos.setFont(new Font("Arial", Font.BOLD, 20));
        bcos.setBackground(Color.yellow);
        bcos.setForeground(Color.black);
        bcos.setFocusable(false);
        frame.add(bcos);

        btan=new JButton("<html>Tan</html>");
        btan.setBounds(290, 290, 70, 40);
        btan.setFont(new Font("Arial", Font.BOLD, 20));
        btan.setBackground(Color.yellow);
        btan.setForeground(Color.black);
        btan.setFocusable(false);
        frame.add(btan);

        bexp=new JButton("<html>Exp</html>");
        bexp.setBounds(290, 350, 70, 40);
        bexp.setFont(new Font("Arial", Font.BOLD, 20));
        bexp.setBackground(Color.yellow);
        bexp.setForeground(Color.black);
        bexp.setFocusable(false);
        frame.add(bexp);

        bfac=new JButton("<html>n!</html>");
        bfac.setBounds(290, 410, 70, 40);
        bfac.setFont(new Font("Arial", Font.BOLD, 20));
        bfac.setBackground(Color.yellow);
        bfac.setForeground(Color.black);
        bfac.setFocusable(false);
        frame.add(bfac);

        bbrac1=new JButton("(");
        bbrac1.setBounds(10, 460, 80, 30);
        bbrac1.setFont(new Font("Arial", Font.BOLD, 20));
        bbrac1.setBackground(Color.yellow);
        bbrac1.setForeground(Color.black);
        bbrac1.setFocusable(false);
        frame.add(bbrac1);

        bbrac2=new JButton(")");
        bbrac2.setBounds(100, 460, 80, 30);
        bbrac2.setFont(new Font("Arial", Font.BOLD, 20));
        bbrac2.setBackground(Color.yellow);
        bbrac2.setForeground(Color.black);
        bbrac2.setFocusable(false);
        frame.add(bbrac2);

        bpi=new JButton("\u03C0");
        bpi.setBounds(190, 460, 80, 30);
        bpi.setFont(new Font("Arial", Font.BOLD, 20));
        bpi.setBackground(Color.yellow);
        bpi.setForeground(Color.black);
        bpi.setFocusable(false);
        frame.add(bpi);

        bcube=new JButton("<html>x<sup>3</sup></html>");
        bcube.setBounds(280, 460, 80, 30);
        bcube.setFont(new Font("Arial", Font.BOLD, 20));
        bcube.setBackground(Color.yellow);
        bcube.setForeground(Color.black);
        bcube.setFocusable(false);
        frame.add(bcube);
    }   
    public void addActionEvent()
    {
        radioOn.addActionListener(this);
        radioOff.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b00.addActionListener(this);
        b0.addActionListener(this);
        bdot.addActionListener(this);
        beq.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bclr.addActionListener(this);
        bdel.addActionListener(this);
        bsq.addActionListener(this);
        bsqrt.addActionListener(this);
        brp.addActionListener(this);
        blog.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bexp.addActionListener(this);
        bfac.addActionListener(this);
        bbrac1.addActionListener(this);
        bbrac2.addActionListener(this);
        bpi.addActionListener(this);
        bcube.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj.equals(radioOn))
        {
            enable();
        }
        else if(obj.equals(radioOff))
        {
            disable();
        }
        else if(obj.equals(bclr))
        {
            label.setText((""));
            text.setText("");
        }
        else if(obj.equals(bdel))
        {
            int length = text.getText().length();
            int number = length-1;
            if(number>0)
            {
                StringBuilder back = new StringBuilder(text.getText());
                back.deleteCharAt(number);
                text.setText(back.toString());
            }
            if(text.getText().endsWith(""))
            {
                label.setText("");
            }
        }
        else if(obj.equals(b0))
        {
            if(text.getText().equals("0"))
            {
                return;
            }
            else{
                text.setText(text.getText() + "0");
            }
        }
        else if(obj.equals(b1))
        {
            text.setText(text.getText() + "1");
        }
        else if(obj.equals(b2))
        {
            text.setText(text.getText() + "2");
        }
        else if(obj.equals(b3))
        {
            text.setText(text.getText() + "3");
        }
        else if(obj.equals(b4))
        {
            text.setText(text.getText() + "4");
        }
        else if(obj.equals(b5))
        {
            text.setText(text.getText() + "5");
        }
        else if(obj.equals(b6))
        {
            text.setText(text.getText() + "6");
        }
        else if(obj.equals(b7))
        {
            text.setText(text.getText() + "7");
        }
        else if(obj.equals(b8))
        {
            text.setText(text.getText() + "8");
        }
        else if(obj.equals(b9))
        {
            text.setText(text.getText() + "9");
        }
        else if(obj.equals(b00))
        {
            text.setText(text.getText() + "00");
        }
        else if(obj.equals(bdot))
        {
            if(text.getText().equals("."))
            {
                return;
            }
            else{
                text.setText(text.getText() + ".");
            }
        }
        //addition
        else if(obj.equals(badd))
        {
            String str = text.getText();
            n1 = Double.parseDouble(text.getText());
            calculation=1;
            text.setText("");
            label.setText(str + " +");
            label.setForeground(Color.white);
        }
        //subtract
        else if(obj.equals(bsub))
        {
            String str = text.getText();
            n1 = Double.parseDouble(text.getText());
            calculation=2;
            text.setText("");
            label.setText(str + " -");
            label.setForeground(Color.white);
        }
        //multiply
        else if(obj.equals(bmul))
        {
            String str = text.getText();
            n1 = Double.parseDouble(text.getText());
            calculation=3;
            text.setText("");
            label.setText(str + " X");
            label.setForeground(Color.white);
        }
        //divide
        else if(obj.equals(bdiv))
        {
            String str = text.getText();
            n1 = Double.parseDouble(text.getText());
            calculation=4;
            text.setText("");
            label.setText(str + " /");
            label.setForeground(Color.white);
        }
        //square
        else if(obj.equals(bsq))
        {
            n1 = Double.parseDouble(text.getText());
            double square = Math.pow(n1,2);
            String str = Double.toString(square);
            if(str.endsWith(".0")){
                text.setText(str.replace(".0", ""));
            }
            else{
                text.setText(str);
            }
        }
        //square root
        else if(obj.equals(bsqrt))
        {
            n1 = Double.parseDouble(text.getText());
            double squareRoot = Math.sqrt(n1);
            text.setText(Double.toString(squareRoot));
        }
        //reciprocal
        else if(obj.equals(brp))
        {
            n1 = Double.parseDouble(text.getText());
            double reciprocal = 1/n1;
            String str = Double.toString(reciprocal);
            text.setText(str);
        }
        //equal
        else if(obj.equals(beq))
        {
            n2 = Double.parseDouble(text.getText());
            switch(calculation)
            {
                case 1 :
                    result = n1+n2;
                    break;
                case 2 :
                    result = n1-n2;
                    break;
                case 3 :
                    result = n1*n2;
                    break;
                case 4 :
                    result = n1/n2;
                    break;
            }
            if(Double.toString(result).endsWith(".0"))
            {
                text.setText((Double.toString(result).replace(".0","")));
            }
            else{
                text.setText((Double.toString(result)));
            }
            label.setText("");
            n1=result;

        }
        else if (obj.equals(bexp))
        {
            String displayValue = text.getText();
            double input = Double.parseDouble(displayValue);
            double result = Math.exp(input);
            text.setText(String.valueOf(result));
		}
        //factorial
        else if(obj.equals(bfac))
        {
            n1 = Double.parseDouble(text.getText());
            int f=1;
            for(int i=1;i<=n1;i++){
                f=f*i;
            }
            text.setText(""+f);
        }
        //bracket 1
        else if(obj.equals(bbrac1))
        {
            text.setText(text.getText() + "(");
        }
        //bracket 2
        else if(obj.equals(bbrac2))
        {
            text.setText(text.getText() + ")");
        }
        //log button
        else if(obj.equals(blog)){
            String displayValue = text.getText();
            double input = Double.parseDouble(displayValue);
            double result = Math.log(input);
            text.setText(String.valueOf(result));
        }
        //sin button
        else if(obj.equals(bsin))
        {
            String displayValue = text.getText();
            double input = Double.parseDouble(displayValue);
            input = Math.toRadians(input);
            double result = Math.sin(input);
            text.setText(String.valueOf(result));
        }
        //cos button
        else if(obj.equals(bcos))
        {
            String displayValue = text.getText();
            double input = Double.parseDouble(displayValue);
            input = Math.toRadians(input);
            double result = Math.cos(input);
            text.setText(String.valueOf(result));
        }
        //tan button
        else if(obj.equals(btan)){
            String displayValue = text.getText();
            double input = Double.parseDouble(displayValue);
            input = Math.toRadians(input);
            double result = Math.tan(input);
            text.setText(String.valueOf(result));
        }
        //pi button
        else if(obj.equals(bpi)){
            text.setText("3.14");
        }
        //cube button
        else if(obj.equals(bcube)){
            n1 = Double.parseDouble(text.getText());
            double cube = Math.pow(n1,3);
            String str = Double.toString(cube);
            if(str.endsWith(".0")){
                text.setText(str.replace(".0", ""));
            }
            else{
                text.setText(str);
            }
        }
    }
    public void enable()
    {
        radioOn.setEnabled(false);
        radioOff.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b00.setEnabled(true);
        b0.setEnabled(true);
        bdot.setEnabled(true);
        beq.setEnabled(true);
        badd.setEnabled(true);
        bsub.setEnabled(true);
        bmul.setEnabled(true);
        bdiv.setEnabled(true);
        bsq.setEnabled(true);
        bsqrt.setEnabled(true);
        brp.setEnabled(true);
        bpi.setEnabled(true);
        bcube.setEnabled(true);
        bsin.setEnabled(true);
        bcos.setEnabled(true);
        btan.setEnabled(true);
        blog.setEnabled(true);
        bclr.setEnabled(true);
        bdel.setEnabled(true);
        label.setEnabled(true);
        text.setEnabled(true);
        bexp.setEnabled(true);
        bbrac1.setEnabled(true);
        bbrac2.setEnabled(true);
        bfac.setEnabled(true);

    }
    public void disable()
    {
        radioOn.setEnabled(true);
        radioOff.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b00.setEnabled(false);
        b0.setEnabled(false);
        bdot.setEnabled(false);
        beq.setEnabled(false);
        badd.setEnabled(false);
        bsub.setEnabled(false);
        bmul.setEnabled(false);
        bdiv.setEnabled(false);
        bsq.setEnabled(false);
        bsqrt.setEnabled(false);
        brp.setEnabled(false);
        bpi.setEnabled(false);
        bcube.setEnabled(false);
        bsin.setEnabled(false);
        bcos.setEnabled(false);
        btan.setEnabled(false);
        blog.setEnabled(false);
        bclr.setEnabled(false);
        bdel.setEnabled(false);
        label.setEnabled(false);
        text.setEnabled(false);
        bexp.setEnabled(false);
        bbrac1.setEnabled(false);
        bbrac2.setEnabled(false);
        bfac.setEnabled(false);
    }
    public static void main(String[] args) 
    {
        new Calculator();
    }
}
