/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirTicketing;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Dell
 */
public class AirTicket extends javax.swing.JFrame {

    //Declaring Variable to store userName obtained from SplashScreen.class
    String userName; 
    
    
    /**
     * Creates new form AirTicket
     */
    public AirTicket() {
        initComponents();    
        
    }
    
    //Constructor for Username
    public AirTicket(String user){
        //Takes the user from SplashScreen
        userName=user;
        initComponents();
        //Setting the Welcome Text using user from SplashScreen
        greetingLbl.setText("Welcome "+userName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new javax.swing.ButtonGroup();
        tripBtnGroup = new javax.swing.ButtonGroup();
        classBtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTbl = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        searchtxtfld = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        greetingLbl = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        namelbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        agelbl = new javax.swing.JLabel();
        phoneTxtField = new javax.swing.JTextField();
        genderlbl = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        contactlbl = new javax.swing.JLabel();
        phonePinTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        depdatelbl = new javax.swing.JLabel();
        departureTxtField = new javax.swing.JTextField();
        fromlbl = new javax.swing.JLabel();
        fromComboBox = new javax.swing.JComboBox<>();
        tolbl = new javax.swing.JLabel();
        toComboBox = new javax.swing.JComboBox<>();
        seatlbl = new javax.swing.JLabel();
        seatTxtField = new javax.swing.JTextField();
        availableSeatBtn = new javax.swing.JButton();
        flightlbl = new javax.swing.JLabel();
        onewayRadioBtn = new javax.swing.JRadioButton();
        wholeTripRadioBtn = new javax.swing.JRadioButton();
        classlbl = new javax.swing.JLabel();
        firstClassRadioBtn = new javax.swing.JRadioButton();
        economyRadioBtn = new javax.swing.JRadioButton();
        airlinelbl = new javax.swing.JLabel();
        airlineComboBox = new javax.swing.JComboBox<>();
        infobtn = new javax.swing.JButton();
        priceTxtField = new javax.swing.JTextField();
        pricelbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        ticketlbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        hiconlbl = new javax.swing.JLabel();
        ticonlbl = new javax.swing.JLabel();
        eiconlbl = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        ticketButton = new java.awt.Button();
        exitBtn = new java.awt.Button();
        jMenuBar1 = new javax.swing.JMenuBar();
        filemenu = new javax.swing.JMenu();
        openmi = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        exitmi = new javax.swing.JMenuItem();
        helpmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mainTbl.setBackground(new java.awt.Color(51, 255, 204));
        mainTbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        mainTbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mainTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Naruto", "+9779841234561", "OneWay", "Ktm-Pkr", "21/12/2019", "Buddha", "Economy", "10 AM", "NA2A", "1000"}
            },
            new String [] {
                "Name", "Contact", "Flight Detail", "From - To", "Departure Date", "Airline", "Class", "Time", "Flight Id", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(mainTbl);
        if (mainTbl.getColumnModel().getColumnCount() > 0) {
            mainTbl.getColumnModel().getColumn(0).setResizable(false);
            mainTbl.getColumnModel().getColumn(0).setPreferredWidth(65);
            mainTbl.getColumnModel().getColumn(1).setResizable(false);
            mainTbl.getColumnModel().getColumn(2).setResizable(false);
            mainTbl.getColumnModel().getColumn(2).setPreferredWidth(65);
            mainTbl.getColumnModel().getColumn(3).setResizable(false);
            mainTbl.getColumnModel().getColumn(4).setPreferredWidth(80);
            mainTbl.getColumnModel().getColumn(5).setResizable(false);
            mainTbl.getColumnModel().getColumn(6).setResizable(false);
            mainTbl.getColumnModel().getColumn(6).setPreferredWidth(60);
            mainTbl.getColumnModel().getColumn(7).setResizable(false);
            mainTbl.getColumnModel().getColumn(7).setPreferredWidth(60);
            mainTbl.getColumnModel().getColumn(8).setResizable(false);
            mainTbl.getColumnModel().getColumn(8).setPreferredWidth(60);
            mainTbl.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(142, 125, 135));

        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchBtn.setText("Search");

        greetingLbl.setAlignment(java.awt.Label.CENTER);
        greetingLbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        greetingLbl.setForeground(new java.awt.Color(0, 255, 204));
        greetingLbl.setText("Welcome");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(greetingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addGap(48, 48, 48))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchtxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn))
                    .addComponent(greetingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(null);

        namelbl.setText("Full Name");
        jPanel3.add(namelbl);
        namelbl.setBounds(35, 100, 70, 20);
        jPanel3.add(nameTxtField);
        nameTxtField.setBounds(135, 100, 190, 20);

        agelbl.setText("Age");
        jPanel3.add(agelbl);
        agelbl.setBounds(35, 140, 60, 20);

        phoneTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneTxtFieldKeyTyped(evt);
            }
        });
        jPanel3.add(phoneTxtField);
        phoneTxtField.setBounds(185, 220, 140, 20);

        genderlbl.setText("Gender");
        jPanel3.add(genderlbl);
        genderlbl.setBounds(35, 180, 80, 20);

        genderBtnGroup.add(maleRadioBtn);
        maleRadioBtn.setText("Male");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });
        jPanel3.add(maleRadioBtn);
        maleRadioBtn.setBounds(135, 180, 60, 20);

        genderBtnGroup.add(femaleRadioBtn);
        femaleRadioBtn.setText("Female");
        jPanel3.add(femaleRadioBtn);
        femaleRadioBtn.setBounds(210, 180, 70, 20);

        contactlbl.setText("Contact no");
        jPanel3.add(contactlbl);
        contactlbl.setBounds(35, 220, 70, 20);
        jPanel3.add(phonePinTxtField);
        phonePinTxtField.setBounds(135, 220, 40, 20);

        ageTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageTxtFieldKeyTyped(evt);
            }
        });
        jPanel3.add(ageTxtField);
        ageTxtField.setBounds(135, 140, 190, 20);

        depdatelbl.setText("Departure Date");
        jPanel3.add(depdatelbl);
        depdatelbl.setBounds(35, 260, 90, 20);
        jPanel3.add(departureTxtField);
        departureTxtField.setBounds(135, 260, 190, 20);

        fromlbl.setText("From");
        jPanel3.add(fromlbl);
        fromlbl.setBounds(35, 300, 50, 20);

        fromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Nepal", "China", "India", "Spain", "Australia" }));
        jPanel3.add(fromComboBox);
        fromComboBox.setBounds(135, 300, 65, 20);

        tolbl.setText("To");
        jPanel3.add(tolbl);
        tolbl.setBounds(210, 300, 20, 20);

        toComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Nepal", "China", "India", "Spain", "Australia" }));
        jPanel3.add(toComboBox);
        toComboBox.setBounds(240, 300, 65, 20);

        seatlbl.setText("Seat");
        jPanel3.add(seatlbl);
        seatlbl.setBounds(35, 340, 40, 20);
        jPanel3.add(seatTxtField);
        seatTxtField.setBounds(135, 340, 180, 20);

        availableSeatBtn.setText("Check available seat");
        jPanel3.add(availableSeatBtn);
        availableSeatBtn.setBounds(90, 380, 180, 21);

        flightlbl.setText("Flight detail");
        jPanel3.add(flightlbl);
        flightlbl.setBounds(400, 180, 70, 13);

        tripBtnGroup.add(onewayRadioBtn);
        onewayRadioBtn.setText("One way");
        jPanel3.add(onewayRadioBtn);
        onewayRadioBtn.setBounds(500, 180, 90, 21);

        tripBtnGroup.add(wholeTripRadioBtn);
        wholeTripRadioBtn.setText("Whole Trip");
        jPanel3.add(wholeTripRadioBtn);
        wholeTripRadioBtn.setBounds(590, 180, 90, 21);

        classlbl.setText("Class");
        jPanel3.add(classlbl);
        classlbl.setBounds(400, 220, 50, 13);

        classBtnGroup.add(firstClassRadioBtn);
        firstClassRadioBtn.setText("First Class");
        jPanel3.add(firstClassRadioBtn);
        firstClassRadioBtn.setBounds(500, 220, 90, 21);

        classBtnGroup.add(economyRadioBtn);
        economyRadioBtn.setText("Economy");
        jPanel3.add(economyRadioBtn);
        economyRadioBtn.setBounds(590, 220, 100, 21);

        airlinelbl.setText("Airlines");
        jPanel3.add(airlinelbl);
        airlinelbl.setBounds(400, 100, 60, 13);

        airlineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buddha Airs", "Qatar Airways", "Turkish Airlines", "Nepal Airlines", "Himalaya Airlines" }));
        jPanel3.add(airlineComboBox);
        airlineComboBox.setBounds(500, 100, 120, 19);

        infobtn.setText("Get Informaton");
        jPanel3.add(infobtn);
        infobtn.setBounds(500, 140, 120, 21);

        priceTxtField.setEditable(false);
        priceTxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceTxtField.setText("Price will be displayed here.");
        jPanel3.add(priceTxtField);
        priceTxtField.setBounds(500, 260, 160, 30);

        pricelbl.setText("Price");
        jPanel3.add(pricelbl);
        pricelbl.setBounds(400, 260, 40, 13);

        clearBtn.setText("Clear");
        jPanel3.add(clearBtn);
        clearBtn.setBounds(580, 300, 70, 21);

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        jPanel3.add(bookBtn);
        bookBtn.setBounds(500, 300, 70, 21);

        ticketlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/airticket.jpg"))); // NOI18N
        ticketlbl.setLabelFor(ticketlbl);
        jPanel3.add(ticketlbl);
        ticketlbl.setBounds(-10, 0, 1110, 420);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(142, 125, 135));
        jPanel2.setLayout(null);

        hiconlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/baseline_home_black_18dp.png"))); // NOI18N
        jPanel2.add(hiconlbl);
        hiconlbl.setBounds(10, 50, 20, 20);

        ticonlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/airplane-flight-ticket.png"))); // NOI18N
        jPanel2.add(ticonlbl);
        ticonlbl.setBounds(10, 110, 20, 30);

        eiconlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/open-exit-door.png"))); // NOI18N
        jPanel2.add(eiconlbl);
        eiconlbl.setBounds(10, 710, 20, 30);

        button1.setBackground(new java.awt.Color(142, 125, 135));
        button1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        button1.setLabel("Home");
        jPanel2.add(button1);
        button1.setBounds(30, 50, 60, 30);

        ticketButton.setBackground(new java.awt.Color(142, 125, 135));
        ticketButton.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        ticketButton.setLabel("Tickets");
        jPanel2.add(ticketButton);
        ticketButton.setBounds(30, 110, 70, 33);

        exitBtn.setBackground(new java.awt.Color(142, 125, 135));
        exitBtn.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        exitBtn.setLabel("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitBtn);
        exitBtn.setBounds(30, 710, 70, 33);

        filemenu.setText("File");

        openmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openmi.setText("Open");
        filemenu.add(openmi);
        filemenu.add(jSeparator11);

        exitmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitmi.setText("Exit");
        exitmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmiActionPerformed(evt);
            }
        });
        filemenu.add(exitmi);

        jMenuBar1.add(filemenu);

        helpmenu.setText("Help");
        jMenuBar1.add(helpmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Action Event for Exit in Menu Option
    private void exitmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmiActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitmiActionPerformed

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioBtnActionPerformed

    //Action Event for Exit Button 
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        
        //Creating Variables to store texts in our table
        
        String name,fromTo,departureDate,airline,from,contact,to;
        String flightId="";
        String flightDetail="";
        String flightClass="";
        String time="";
        //Boolean to check duplicate values
        Boolean duplicate=false;
        int price=0;    
        int rowCount = mainTbl.getRowCount();
        int colCount = mainTbl.getColumnCount();
        
        /**
         * 
         * 
         * If else to check empty text fields and radio buttons
         * 
         */
        if(nameTxtField.getText().equals("") || ageTxtField.getText().equals("") ||phonePinTxtField.getText().equals("") || phoneTxtField.getText().equals("") ||
           departureTxtField.getText().equals("") || seatTxtField.getText().equals("") || genderBtnGroup.getSelection()==null ||
           tripBtnGroup.getSelection()==null || classBtnGroup.getSelection()==null ){
            JOptionPane.showMessageDialog(rootPane, "Empty Fields or Radio Buttons", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(phoneTxtField.getText().length()!=10){//Checks Length of Phone Number 
            JOptionPane.showMessageDialog(rootPane, "Phone number must be 10 digits", "Error", JOptionPane.ERROR_MESSAGE);            
        }else if(fromComboBox.getSelectedIndex()==0||toComboBox.getSelectedIndex()==0){//Checks selection of combo boxes
            JOptionPane.showMessageDialog(rootPane, "From OR To not Selected", "Error", JOptionPane.ERROR_MESSAGE);            
        }else{   
                   
            /**
             * 
             * If the validation checks are cleared,
             * getting the texts from textFields and
             * storing them in the declared variables
             * 
             */
            name=nameTxtField.getText();

            /**
             * 
             * 
             * String to concatenate phone number and phone pin
             * 
             */
            String phoneConcat=phonePinTxtField.getText()+phoneTxtField.getText();
            contact=String.valueOf("+"+phoneConcat);
            
              /**
               * 
               * 
               *  Code to get price of selected flight type
               * 
               */
            if(onewayRadioBtn.isSelected()){
                 flightDetail = "One Way";
                 price = price + 400;
            }else if (wholeTripRadioBtn.isSelected()){
                 flightDetail = "Whole Trip";    
                 price = price + 800;
            }
            
             /**
              * 
              * 
              * Code to get departure date and flightId 
              * 
              */
             departureDate = departureTxtField.getText(); 
             String id = departureDate.substring(0,departureDate.length() - 8);

             /**
              * 
              * Setting values of from and to comboBox to declared strings
              * 
              */
             from = (String) fromComboBox.getSelectedItem();
             to = (String) toComboBox.getSelectedItem();
             fromTo = from + "-" + to ;
             
             /**
              * 
              * 
              * Setting the Price based on User's Destination
              * 
              */
            if((from == "Nepal" && to=="India" )|| (from == "India" && to== "Nepal")){
                price = price + 500;
                flightId = "NI"+id;
            } 
            else if((from == "Nepal" && to=="China") || (from == "China" && to=="Nepal")){
                price = price + 600;
                flightId = "NC"+id;
            } 
            else if((from == "Nepal" && to=="Spain") || (from == "Spain" && to=="Nepal")){
                price = price + 800;
                flightId = "NS"+id;
            } 
            else if((from == "Nepal" && to=="Australia") || (from == "Australia" && to=="Nepal")){
                price = price + 400;
                flightId = "NA"+id;
            } 
            else if((from == "India" && to=="China") || (from == "China" && to=="India")){
                price = price + 300;
                flightId = "IC"+id;
            } 
            else if((from == "India" && to=="Spain") || (from == "Spain" && to=="India")){
                price = price + 900;
                flightId = "IS"+id;
            } 
            else if((from == "India" && to=="Australia") || (from == "Australia" && to=="India")){
                price = price + 500;
                flightId = "IA"+id;
            } 
            if((from == "China" && to=="Spain") || (from == "Spain" && to=="China")){
                price = price + 700;
                flightId = "CS"+id;
            } 
            else if((from == "China" && to=="Australia" || from == "Australia" && to=="China")){
                price = price + 500;
                flightId = "CA"+id;
            } 
            else if((from == "Spain" && to=="Australia" || from == "Australia" && to=="Spain")){
                price = price + 1000;
                flightId = "SA"+id;
            }
            
            /** 
             * 
             * Code to get price of selected airline
             * 
             */
             airline = (String) airlineComboBox.getSelectedItem();
         
             if( airline == "Buddha Airs" ){
                 price = price + 200;
                 time = "10:00 A.M";
                 flightId = flightId + "BA";
            }else if( airline == "Qatar Airways" ){
                 price = price + 300;
                 time = "12:30 P.M";
                 flightId = flightId + "QA";
            }else if( airline == "Turkish Airlines" ){
                 price = price + 400;
                 time = "03:00 P.M";
                 flightId = flightId + "TA";
            }else if( airline == "Nepal Airlines" ){
                 price = price + 200;
                time = "05:30 P.M";
                flightId = flightId + "NA";
            }else if( airline == "Himalaya Airlines" ){
                 price = price + 400;
                time = "08:30 P.M";
                 flightId = flightId + "HA";
         }
               /**
                * 
                * 
                * code to get selected flight class
                * 
                */
            if(firstClassRadioBtn.isSelected()){
                 flightClass = "First Class ";
                 price = price + 800;
            }else if (economyRadioBtn.isSelected()){
                 flightClass = "Economy";    
                 price = price + 400;
            }
            
            /**
             * 
             * 
             * Setting the final total price
             * 
             */
            String total=String.valueOf(price);
            priceTxtField.setText(total);
            
            /**
             * 
             * 
             * Checking if the user inserts duplicate data
             * 
             */
            try{
                for(int i=0;i<rowCount;i++){
                    if((mainTbl.getValueAt(i, 0).equals(name)) && (mainTbl.getValueAt(i, 1).equals(contact)) && (mainTbl.getValueAt(i, 2).equals(flightDetail))
                        && (mainTbl.getValueAt(i, 3).equals(fromTo)) && (mainTbl.getValueAt(i, 4).equals(departureDate)) && (mainTbl.getValueAt(i, 5).equals(airline))
                        && (mainTbl.getValueAt(i, 6).equals(flightClass)) && (mainTbl.getValueAt(i, 7).equals(time)) && (mainTbl.getValueAt(i, 8).equals(flightId))){
                             
                             /**
                              * 
                              * 
                              * Sets the Boolean to true if there is any duplicate data.
                              * The whole data entered should be same!
                              */
                             duplicate=true;
                             JOptionPane.showMessageDialog(rootPane, "Ticket Already Booked", "Message", JOptionPane.INFORMATION_MESSAGE);

                    }           
                }                

                /**
                 * 
                 * 
                 * Gives Error Message if same destination is selected
                 * 
                 */
                 if(from == to){
                     JOptionPane.showMessageDialog(rootPane, "Same destination please select another", "Error", JOptionPane.ERROR_MESSAGE);
                     fromComboBox.setSelectedIndex(0);
                     toComboBox.setSelectedIndex(0);
                  }else if(!duplicate) { //Adds to Table if duplicate Boolean is false
                        String data[] = {name, contact, flightDetail, fromTo, departureDate, airline, flightClass, time, flightId, total};  
                        //Getting the table's total number of columns and rows  
                        DefaultTableModel model=(DefaultTableModel) mainTbl.getModel();
                        model.addRow(new Object[1]);
                        boolean empty = false;
                        int nextRow = 0;
                        String s;
                         do{
                            s=(String) mainTbl.getValueAt(nextRow, 0);
                            if (s!=null && s.length()!=0){
                            nextRow++;
                            }
                            else{
                                empty = true;
                            }   
                         }
                         while(!empty);                        
                           
                            for(int i=0; i<colCount;i++) {
                                mainTbl.setValueAt(data[i], nextRow, i);
                            }
                        }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    /*Consumes any letters type in age field
       And allows only numerals 
    */
    private void ageTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTxtFieldKeyTyped
        // TODO add your handling code here:
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_ageTxtFieldKeyTyped

    private void phoneTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTxtFieldKeyTyped
        // TODO add your handling code here:
            if(Character.isLetter(evt.getKeyChar())){
                evt.consume();
        }
    }//GEN-LAST:event_phoneTxtFieldKeyTyped

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
            java.util.logging.Logger.getLogger(AirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel agelbl;
    private javax.swing.JComboBox<String> airlineComboBox;
    private javax.swing.JLabel airlinelbl;
    private javax.swing.JButton availableSeatBtn;
    private javax.swing.JButton bookBtn;
    private java.awt.Button button1;
    private javax.swing.ButtonGroup classBtnGroup;
    private javax.swing.JLabel classlbl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel contactlbl;
    private javax.swing.JTextField departureTxtField;
    private javax.swing.JLabel depdatelbl;
    private javax.swing.JRadioButton economyRadioBtn;
    private javax.swing.JLabel eiconlbl;
    private java.awt.Button exitBtn;
    private javax.swing.JMenuItem exitmi;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JMenu filemenu;
    private javax.swing.JRadioButton firstClassRadioBtn;
    private javax.swing.JLabel flightlbl;
    private javax.swing.JComboBox<String> fromComboBox;
    private javax.swing.JLabel fromlbl;
    private javax.swing.ButtonGroup genderBtnGroup;
    private javax.swing.JLabel genderlbl;
    private java.awt.Label greetingLbl;
    private javax.swing.JMenu helpmenu;
    private javax.swing.JLabel hiconlbl;
    private javax.swing.JButton infobtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    public javax.swing.JTable mainTbl;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel namelbl;
    private javax.swing.JRadioButton onewayRadioBtn;
    private javax.swing.JMenuItem openmi;
    private javax.swing.JTextField phonePinTxtField;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JLabel pricelbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchtxtfld;
    private javax.swing.JTextField seatTxtField;
    private javax.swing.JLabel seatlbl;
    private java.awt.Button ticketButton;
    private javax.swing.JLabel ticketlbl;
    private javax.swing.JLabel ticonlbl;
    private javax.swing.JComboBox<String> toComboBox;
    private javax.swing.JLabel tolbl;
    private javax.swing.ButtonGroup tripBtnGroup;
    private javax.swing.JRadioButton wholeTripRadioBtn;
    // End of variables declaration//GEN-END:variables
}