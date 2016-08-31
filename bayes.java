   /*WorkType       Age     Qualication     Experience

    Consultancy    30       Ph.D.             9
    Service        21       MTech.            1
    Research       26       MTech.            2
    Service        28       BTech.            10
    Consultancy    40       MTech.            14
    Research       35       Ph.D.             10
    Research       27       BTech.             6
    Service        32       MTech.             9
    Consultancy    45       Btech.            17
    Research       36       Ph.D.              7

*/
    
    import java.awt.BorderLayout;

    import javax.swing.*;

    public class bayes  
    {
        JFrame frame;
        JTable table;
        JPanel panel;
        JScrollPane tableContainer;

        int i,j;
        float countC=0,countR=0,countS=0;
        float countM=0,countP=0,countB=0;
	float countY=0,countMA=0,countO=0;
	float countL=0,countMI=0,countH=0;
        
      
        int[] CAge=new int[3];


        public static void main(String arg[])
        {
           bayes b = new bayes();
             
        }
         public bayes()
        {
              frame = new JFrame("JTable Test Display");

              panel = new JPanel();
              panel.setLayout(new BorderLayout());
             String row[][]={{"consultancy","30","phd","9"},  
                   {"service","21","mtech","1"}              ,
                {"research","26","mtech","2"},{"service","28","btech","10"},
                {"consultancy","40","mtech","14"},{"research","35","phd","10"},
                {"research","27","btech","6"},{"service","32","mtech","9"},
                {"consultancy","45","btech","17"},{"research","36","phd","7"}};

        String column[]={"job","age","qualification","experience"};
        table=new JTable(row,column);

         tableContainer = new JScrollPane(table);

        panel.add(tableContainer, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);



        //work 
	System.out.println("\n***********Prbability for Work Type********");
        for(i=0;i<10;i++)
        {
            if(table.getValueAt(i,0)=="consultancy")
            {
                countC++;
	    }
	    
            if(table.getValueAt(i,0)=="research")
            {
                countR++;
            }
            if(table.getValueAt(i,0)=="service")
            {
                countS++;
            }
        }
       System.out.printf("count of consultancy: %.2f \n", countC);
       System.out.printf("count of research : %.2f\n" , countR);
       System.out.printf("count of service : %.2f\n" ,countS);
       


       float C = countC/10;
       float R = countR/10;
       float S = countS/10;
       System.out.printf("\n P(consultancy) : %.2f \n", C);
       System.out.printf("\n P(research) : %.2f \n", R);
       System.out.printf("\n P(service) : %.2f \n", S);

  	//Qualification
       System.out.println("\n***********Prbability for Qualification********");	
       for(i=0;i<10;i++)
        {
            if(table.getValueAt(i,2)=="mtech")
            {
                countM++;
	    }
	    
            if(table.getValueAt(i,2)=="phd")
            {
                countP++;
            }
            if(table.getValueAt(i,2)=="btech")
           {
                countB++;
            }
        }
       System.out.printf("\ncount of Mtech: %.2f \n", countM);
       System.out.printf("count of Ph.D : %.2f \n" , countP);
       System.out.printf("count of Btech : %.2f\n" ,countB);
       
       float M = countM/10;
       float P = countP/10;
       float B = countB/10;
       System.out.printf("\n P(Mtech) : %.2f \n", M);
       System.out.printf("\n P(Ph.D) : %.2f \n", P);
       System.out.printf("\n P(Btech) : %.2f \n", B);
	
	//Age
		System.out.println("\n***********Prbability for Age Type********");
	 for(i=0;i<10;i++)
        {
            if((Integer.parseInt((String)table.getValueAt(i, 1))<30))
            {
                countY++;
	    }
	    
            if(((Integer.parseInt((String)table.getValueAt(i, 1))>=30)) && ((Integer.parseInt((String)table.getValueAt(i, 1))<40)))
            {
                countMA++;
            }
            if((Integer.parseInt((String)table.getValueAt(i, 1))>=40))
            {
                countO++;
            }
        }
       System.out.printf("\ncount of Youth: %.2f \n", countY);
       System.out.printf("count of Middle Age : %.2f\n" , countMA);
       System.out.printf("count of Old : %.2f\n" ,countO);
       


       float Y = countY/10;
       float M1 = countMA/10;
       float O = countO/10;
       System.out.printf("\n P(Youth) : %.2f \n", Y);
       System.out.printf("\n P(Middle Age) : %.2f \n", M1);
       System.out.printf("\n P(Old) : %.2f \n", O);

	//Experience
		System.out.println("\n***********Prbability for Experience********");
	 for(i=0;i<10;i++)
        {
            if((Integer.parseInt((String)table.getValueAt(i, 3))<5))
            {
                countL++;
	    }
	    
            if(((Integer.parseInt((String)table.getValueAt(i, 3))>=5)) && ((Integer.parseInt((String)table.getValueAt(i, 3))<=10)))
            {
                countMI++;
            }
            if((Integer.parseInt((String)table.getValueAt(i, 3))>10))
            {
                countH++;
            }
        }
       System.out.printf("\ncount of Low: %.2f \n", countL);
       System.out.printf("count of Medium : %.2f\n" , countMI);
       System.out.printf("count of High : %.2f\n" ,countH);
       


       float L = countL/10;
       float M2 = countMI/10;
       float H = countH/10;
       System.out.printf("\n P(Low) : %.2f \n", L);
       System.out.printf("\n P(Medium) : %.2f \n", M2);
       System.out.printf("\n P(High) : %.2f \n", H);

	
	System.out.println("\n-----Condtional Probalbility----");
   }
}
