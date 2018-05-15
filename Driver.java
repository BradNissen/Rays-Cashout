/** 
 * This is the Cash out application. made for work at Rays Boathouse.
 * Designed by Brad Nissen, after the Computer Science courses taken at Shoreline
 * Community College.
 * Enjoy!
 */
package Cashout;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BradNissen
 */
public class Driver extends javax.swing.JFrame {

    //object from the sales class.
    Sales sales = new Sales();  //Will be universal to the classes.

    // Default Constructor
    public Driver() 
    {
        initComponents();
        setLocationRelativeTo(null);
        this.rootPane.setDefaultButton(cashoutJButton);
        
    }

    /**
     * setSales
     *
     * This method gets the input from the JTextField and stores them in the
     * Sales Class. 
     * 
     * @return void
     * @see #salesJPanel
     */
    protected void getFields() {
        // Validation! 
        String foodSales = foodSalesJTextField.getText();
        String bevSales = bevSalesJTextField.getText();
        String expoSales = expoSalesJTextField.getText();
        String netTips = netTipsJTextField.getText();
        String ccTips = ccTipsJTextField.getText();
        String cashTips = cashJTextField.getText();  
        String amFoodSales = amFoodSalesJTextField.getText();
        String amBevSales = amBevSalesJTextField.getText();
        String amExpodSales = amExpoSalesJTextField.getText();

        //ALL day sales
        double PM_Food_Sales = Double.parseDouble(foodSales);
        double PM_Bev_Sales  = Double.parseDouble(bevSales);
        double PM_Expo_Sales = Double.parseDouble(expoSales);
        double CC_Tips = Double.parseDouble(ccTips);
        double NET_Tips = Double.parseDouble(netTips);
        double Cash_total = Double.parseDouble(cashTips); 
        //Am sales
        double AM_Food_Sales = Double.parseDouble(amFoodSales);
        double AM_Bev_Sales  = Double.parseDouble(amBevSales);
        double AM_Expo_Sales = Double.parseDouble(amExpodSales);
        
        //Soo youre just left with nightly sales.
        double pmFoodSalesTipout = PM_Food_Sales - AM_Food_Sales;
        double pmBevSalesTipout  = PM_Bev_Sales - AM_Bev_Sales;
        double pmExpoSalesTip = PM_Expo_Sales - AM_Expo_Sales;
        
        
        sales.setFoodSales(pmFoodSalesTipout);
        sales.setBevSales(pmBevSalesTipout);
        sales.setExpoSales(pmExpoSalesTip);
        sales.setVisaTips(CC_Tips);
        sales.setNetTips(NET_Tips);
        sales.setCashTips(Cash_total);
        sales.setAmFoodSales(AM_Food_Sales);
        sales.setAmBevSales(AM_Bev_Sales);
        sales.setAmExpoSales(AM_Expo_Sales);

    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/YYYY");
        Date today = new Date();
        String date = sdf.format(today);
        
        //Get the Location
        int AM_Busser = amBusserJComboBox.getSelectedIndex();
        int PM_Busser = pmBusserJComboBox.getSelectedIndex();
        
        //return Sting of that selected  index.
        String am = amBusserJComboBox.getItemAt(AM_Busser);
        String pm = pmBusserJComboBox.getItemAt(PM_Busser);
        
        //To set the string to equal empty String.
        //AM name set
        if (am.equals("Select...")){
            amBusNameJLabel.setText("");
        }
        else{
            amBusNameJLabel.setText("AM : " + am);
        }
        //PM name set
        if (pm.equals("Select...")){
            pmBusNameJLabel.setText("");
        }
        else{
            pmBusNameJLabel.setText("PM : " + pm);
        }
        
        
        //String displayNetTips = "";
        if (sales.getNetTips() < 0)
        {
            
            //displayNetTips = Double.toString((-1 * sales.getNetTips()) + sales.getCashTips());
            paycheckJTextField.setText(Double.toString((-1 * sales.getNetTips())));
            oweJTextField.setText("You Don't owe!");
        }
        else {
            oweJTextField.setText(Double.toString(sales.getNetTips()));
            paycheckJTextField.setText("You owe!");
        } 
       
        //Change from double to String
        //displayNetTips = Double.toString(sales.getNetTips() + sales.getCashTips());
        String displayccTips = String.format("%1$.2f", sales.getVisaTips());
        String displayBarTips = String.format("%1$.2f", sales.getBarTips());
        String displayHostTips = String.format("%1$.2f", sales.getHostTips());
        String displayExpoTips = String.format("%1$.2f", sales.getExpoTips());
        String displayBusserTips = String.format("%1$.2f", sales.getBusserTips());
        
        String displayAMBusser = String.format("%1$.2f",sales.getAmBusserTips());
        String displayAMBar = String.format("%1$.2f",sales.getAmBarTips());
        String displayAMExpo = String.format("%1$.2f",sales.getAmExpoTips());
        String displayAMhost = String.format("%1$.2f",sales.getAmHostTips());

        //set the date
        dateJTextField.setText(date);
        //the net tips
        //netJTextField.setText(displayNetTips);   // Total Tips
        netJTextField.setText(netTipsJTextField.getText());
        //CC tips
        ccTipJTextField.setText(displayccTips);
        //BAR
        amBarTipJTextField.setText(displayAMBar);
        pmBarTipJTextField.setText(displayBarTips);
        //HOST
        amHostTipJTextField.setText(displayAMhost);
        pmHostTipJTextField.setText(displayHostTips);
        //EXPO
        amExpoTipJTextField.setText(displayAMExpo);
        pmExpoTipJTextField.setText(displayExpoTips);
        //BUSSER
        amBusserTipJTextField.setText(displayAMBusser);
        pmBusserTipJTextField.setText(displayBusserTips);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJPanel = new javax.swing.JPanel();
        titleJLabel = new javax.swing.JLabel();
        ryasLogoJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        posterJLabel = new javax.swing.JLabel();
        bodyJPanel = new javax.swing.JPanel();
        northJPanel = new javax.swing.JPanel();
        salesJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        foodSalesJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bevSalesJTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        expoSalesJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        netTipsJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ccTipsJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cashJTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        pmBusserJComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        amFoodSalesJTextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        amBevSalesJTextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        amExpoSalesJTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        amBusserJComboBox = new javax.swing.JComboBox<>();
        displayJPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        netJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ccTipJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        amBarTipJTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        pmBarTipJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        amHostTipJTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        pmHostTipJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        amExpoTipJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pmExpoTipJTextField = new javax.swing.JTextField();
        amBusNameJLabel = new javax.swing.JLabel();
        amBusserTipJTextField = new javax.swing.JTextField();
        pmBusNameJLabel = new javax.swing.JLabel();
        pmBusserTipJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        oweJTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        paycheckJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        buttonJPanel = new javax.swing.JPanel();
        exitJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        unbumpJButton = new javax.swing.JButton();
        bumpJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cashoutJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearMenuItem = new javax.swing.JMenuItem();
        printMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuIItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rays Cafe Program");
        setResizable(false);

        titleJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setBackground(new java.awt.Color(177, 172, 172));
        titleJLabel.setFont(new java.awt.Font("PilGi", 0, 56)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleJLabel.setText("Cashout");
        titleJPanel.add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 380, 80));

        ryasLogoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ryasLogoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cashout/images/Rayslogo.png"))); // NOI18N
        titleJPanel.add(ryasLogoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, 60));

        nameJLabel.setFont(new java.awt.Font("Menlo", 0, 10)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameJLabel.setText("By: Brad Nissen");
        titleJPanel.add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        posterJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cashout/images/viewIcon.jpg"))); // NOI18N
        titleJPanel.add(posterJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 100));

        getContentPane().add(titleJPanel, java.awt.BorderLayout.NORTH);

        salesJPanel.setLayout(new java.awt.GridLayout(12, 2));

        jLabel1.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Food Sales: ");
        salesJPanel.add(jLabel1);

        foodSalesJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodSalesJTextFieldActionPerformed(evt);
            }
        });
        salesJPanel.add(foodSalesJTextField);

        jLabel2.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Beverage Sales:");
        salesJPanel.add(jLabel2);
        salesJPanel.add(bevSalesJTextField);

        jLabel16.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Tip Expo:");
        jLabel16.setToolTipText("Expo");
        salesJPanel.add(jLabel16);

        expoSalesJTextField.setText("0");
        salesJPanel.add(expoSalesJTextField);

        jLabel3.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Net Tips:");
        salesJPanel.add(jLabel3);

        netTipsJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netTipsJTextFieldActionPerformed(evt);
            }
        });
        salesJPanel.add(netTipsJTextField);

        jLabel4.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Credit Card Tips:");
        salesJPanel.add(jLabel4);
        salesJPanel.add(ccTipsJTextField);

        jLabel5.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cash:");
        salesJPanel.add(jLabel5);

        cashJTextField.setText("0");
        salesJPanel.add(cashJTextField);

        jLabel26.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Choose your Busser:");
        jLabel26.setToolTipText("Select busser from List");
        salesJPanel.add(jLabel26);

        pmBusserJComboBox.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        pmBusserJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Austin Wienmier", "Jake Devine", "Danny Corliss", "Ryan", "Tim", "Natasha Baron", "Sam Vining", "Gabe", " " }));
        salesJPanel.add(pmBusserJComboBox);
        salesJPanel.add(jSeparator2);
        salesJPanel.add(jSeparator3);

        jLabel31.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("AM Food Sales:");
        salesJPanel.add(jLabel31);

        amFoodSalesJTextField.setText("0");
        amFoodSalesJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amFoodSalesJTextFieldActionPerformed(evt);
            }
        });
        salesJPanel.add(amFoodSalesJTextField);

        jLabel32.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("AM Beverge Sales:");
        salesJPanel.add(jLabel32);

        amBevSalesJTextField.setText("0");
        salesJPanel.add(amBevSalesJTextField);

        jLabel33.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("AM Expo Sales:");
        salesJPanel.add(jLabel33);

        amExpoSalesJTextField.setText("0");
        salesJPanel.add(amExpoSalesJTextField);

        jLabel35.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Choose you AM Busser:");
        salesJPanel.add(jLabel35);

        amBusserJComboBox.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        amBusserJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Austin Wienmier", "Jake Devine", "Danny Corliss", "Ryan", "Tim", "Natasha Baron", "Sam Vining", "Gabe", " " }));
        salesJPanel.add(amBusserJComboBox);

        displayJPanel.setLayout(new java.awt.GridLayout(15, 2));

        jLabel15.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Today's Date:");
        displayJPanel.add(jLabel15);

        dateJTextField.setEditable(false);
        displayJPanel.add(dateJTextField);

        jLabel6.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("NET (+/-):");
        displayJPanel.add(jLabel6);

        netJTextField.setEditable(false);
        displayJPanel.add(netJTextField);

        jLabel7.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Credit Card Discount:");
        displayJPanel.add(jLabel7);

        ccTipJTextField.setEditable(false);
        displayJPanel.add(ccTipJTextField);

        jLabel8.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("AM Bar:");
        displayJPanel.add(jLabel8);

        amBarTipJTextField.setEditable(false);
        displayJPanel.add(amBarTipJTextField);

        jLabel21.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("PM Bar:");
        displayJPanel.add(jLabel21);

        pmBarTipJTextField.setEditable(false);
        displayJPanel.add(pmBarTipJTextField);

        jLabel9.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("AM Host:");
        displayJPanel.add(jLabel9);

        amHostTipJTextField.setEditable(false);
        displayJPanel.add(amHostTipJTextField);

        jLabel22.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("PM Host:");
        displayJPanel.add(jLabel22);

        pmHostTipJTextField.setEditable(false);
        displayJPanel.add(pmHostTipJTextField);

        jLabel10.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("AM Expo:");
        displayJPanel.add(jLabel10);

        amExpoTipJTextField.setEditable(false);
        displayJPanel.add(amExpoTipJTextField);

        jLabel11.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PM Expo:");
        displayJPanel.add(jLabel11);

        pmExpoTipJTextField.setEditable(false);
        displayJPanel.add(pmExpoTipJTextField);

        amBusNameJLabel.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        amBusNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayJPanel.add(amBusNameJLabel);

        amBusserTipJTextField.setEditable(false);
        displayJPanel.add(amBusserTipJTextField);

        pmBusNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayJPanel.add(pmBusNameJLabel);

        pmBusserTipJTextField.setEditable(false);
        displayJPanel.add(pmBusserTipJTextField);

        jLabel13.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("You Owe:");
        displayJPanel.add(jLabel13);

        oweJTextField.setEditable(false);
        oweJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oweJTextFieldActionPerformed(evt);
            }
        });
        displayJPanel.add(oweJTextField);

        jLabel14.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("On Paycheck:");
        displayJPanel.add(jLabel14);

        paycheckJTextField.setEditable(false);
        displayJPanel.add(paycheckJTextField);

        jLabel17.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayJPanel.add(jLabel17);

        jLabel18.setToolTipText("Busser in the AM");
        displayJPanel.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayJPanel.add(jLabel19);

        jLabel20.setToolTipText("Busser in the PM");
        displayJPanel.add(jLabel20);

        javax.swing.GroupLayout northJPanelLayout = new javax.swing.GroupLayout(northJPanel);
        northJPanel.setLayout(northJPanelLayout);
        northJPanelLayout.setHorizontalGroup(
            northJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        northJPanelLayout.setVerticalGroup(
            northJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(northJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(displayJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        buttonJPanel.setLayout(new java.awt.GridLayout(1, 5));

        exitJButton.setText("Exit");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });
        buttonJPanel.add(exitJButton);

        clearJButton.setText("Clear");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });
        buttonJPanel.add(clearJButton);

        unbumpJButton.setText("Unbump");
        buttonJPanel.add(unbumpJButton);

        bumpJButton.setText("Bump");
        buttonJPanel.add(bumpJButton);

        jButton1.setText("Tranfers?");
        buttonJPanel.add(jButton1);

        cashoutJButton.setText("Cashout");
        cashoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashoutJButtonActionPerformed(evt);
            }
        });
        buttonJPanel.add(cashoutJButton);

        javax.swing.GroupLayout bodyJPanelLayout = new javax.swing.GroupLayout(bodyJPanel);
        bodyJPanel.setLayout(bodyJPanelLayout);
        bodyJPanelLayout.setHorizontalGroup(
            bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyJPanelLayout.createSequentialGroup()
                .addComponent(northJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bodyJPanelLayout.createSequentialGroup()
                .addComponent(buttonJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyJPanelLayout.setVerticalGroup(
            bodyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyJPanelLayout.createSequentialGroup()
                .addComponent(northJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bodyJPanel, java.awt.BorderLayout.CENTER);

        fileJMenu.setText("File");

        clearMenuItem.setText("Clear");
        fileJMenu.add(clearMenuItem);

        printMenuItem.setText("Print");
        fileJMenu.add(printMenuItem);
        fileJMenu.add(jSeparator1);

        exitMenuIItem.setText("Exit");
        exitMenuIItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuIItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitMenuIItem);

        jMenuBar1.add(fileJMenu);

        helpJMenu.setText("Help");

        aboutJMenuItem.setText("About");
        helpJMenu.add(aboutJMenuItem);

        jMenuBar1.add(helpJMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashoutJButtonActionPerformed
        // TODO add your handling code here:
        getFields();
        displayInfo();

    }//GEN-LAST:event_cashoutJButtonActionPerformed

    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJButtonActionPerformed
        //End Program
        System.exit(0);
    }//GEN-LAST:event_exitJButtonActionPerformed

    private void amFoodSalesJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amFoodSalesJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amFoodSalesJTextFieldActionPerformed

    private void foodSalesJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodSalesJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodSalesJTextFieldActionPerformed

    private void oweJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oweJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oweJTextFieldActionPerformed

    private void netTipsJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netTipsJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netTipsJTextFieldActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        //Clear the fields. 
        foodSalesJTextField.setText("");
        bevSalesJTextField.setText("");
        expoSalesJTextField.setText("0");
        netTipsJTextField.setText("");
        ccTipsJTextField.setText("");
        cashJTextField.setText("0");
        pmBusserJComboBox.getComponent(0);
        
        
    }//GEN-LAST:event_clearJButtonActionPerformed

    private void exitMenuIItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuIItemActionPerformed
        // TODO add your handling code here:
        System.exit( 0 );
    }//GEN-LAST:event_exitMenuIItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JTextField amBarTipJTextField;
    private javax.swing.JTextField amBevSalesJTextField;
    private javax.swing.JLabel amBusNameJLabel;
    private javax.swing.JComboBox<String> amBusserJComboBox;
    private javax.swing.JTextField amBusserTipJTextField;
    private javax.swing.JTextField amExpoSalesJTextField;
    private javax.swing.JTextField amExpoTipJTextField;
    private javax.swing.JTextField amFoodSalesJTextField;
    private javax.swing.JTextField amHostTipJTextField;
    private javax.swing.JTextField bevSalesJTextField;
    private javax.swing.JPanel bodyJPanel;
    private javax.swing.JButton bumpJButton;
    private javax.swing.JPanel buttonJPanel;
    private javax.swing.JTextField cashJTextField;
    private javax.swing.JButton cashoutJButton;
    private javax.swing.JTextField ccTipJTextField;
    private javax.swing.JTextField ccTipsJTextField;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearMenuItem;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JButton exitJButton;
    private javax.swing.JMenuItem exitMenuIItem;
    private javax.swing.JTextField expoSalesJTextField;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JTextField foodSalesJTextField;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField netJTextField;
    private javax.swing.JTextField netTipsJTextField;
    private javax.swing.JPanel northJPanel;
    private javax.swing.JTextField oweJTextField;
    private javax.swing.JTextField paycheckJTextField;
    private javax.swing.JTextField pmBarTipJTextField;
    private javax.swing.JLabel pmBusNameJLabel;
    private javax.swing.JComboBox<String> pmBusserJComboBox;
    private javax.swing.JTextField pmBusserTipJTextField;
    private javax.swing.JTextField pmExpoTipJTextField;
    private javax.swing.JTextField pmHostTipJTextField;
    private javax.swing.JLabel posterJLabel;
    private javax.swing.JMenuItem printMenuItem;
    private javax.swing.JLabel ryasLogoJLabel;
    private javax.swing.JPanel salesJPanel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JButton unbumpJButton;
    // End of variables declaration//GEN-END:variables
}
