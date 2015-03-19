/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfpulseapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Zbrodale
 */
public class SelfPulseApp {

    JFrame frame = new JFrame("Self Pulse Application");
    Dimension dim1 = new Dimension(1000, 700);
    Dimension dim2 = new Dimension(450, 300);
    Font header = new Font("Arial", Font.BOLD, 65);
    Font bigFont = new Font("Arial", Font.BOLD, 35);
    Font medFont = new Font("Arial", Font.PLAIN, 20);
    JPanel firstPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JLabel title = new JLabel("Self-Pulse");
    JPanel secondPanel = new JPanel();
    Color background = new Color(204, 255, 255);
    JPanel currentPulsePanel = new JPanel();
    JButton currentPulse = new JButton("Current Pulse");
    JPanel changeDatePanel = new JPanel();
    JButton changeDate = new JButton("Change Date");
    JPanel changeTimePanel = new JPanel();
    JButton changeTime = new JButton("Change Time");
    JPanel questionPanel = new JPanel();
    JLabel question = new JLabel("How long ago did you eat?");
    JButton oneHour = new JButton("1 Hour or Less");
    JPanel oneHourPanel = new JPanel();
    JButton twoHour = new JButton("2 Hours");
    JPanel twoHourPanel = new JPanel();
    JButton threeHour = new JButton("3 or More Hours");
    JPanel threeHourPanel = new JPanel();
    JPanel thirdPanel = new JPanel();
    JLabel newDate = new JLabel("Set Date");
    String[] mo = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
    JComboBox month = new JComboBox(mo);
    String[] d = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
        "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
        "25", "26", "27", "28", "29", "30", "31"};
    JComboBox day = new JComboBox(d);
    String[] y = {"2015", "2016", "2017", "2018", "2019", "2020"};
    JComboBox year = new JComboBox(y);
    JLabel newHour = new JLabel("Hour");
    String[] h = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    JComboBox hour = new JComboBox(h);
    JLabel newMinute = new JLabel("Minute");
    String[] mi = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09",
        "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
        "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33",
        "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45",
        "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57",
        "58", "59"};
    JComboBox minute = new JComboBox(mi);
    String[] ap = {"AM", "PM"};
    JComboBox ampm = new JComboBox(ap);
    JButton makeChange = new JButton("Set");
    JPanel makeChangePanel = new JPanel();
    JPanel datePanel = new JPanel();
    JPanel timePanel = new JPanel();
    Calendar newCal = Calendar.getInstance();
    JPanel fourthPanel = new JPanel();
    JLabel surfacePulse = new JLabel("Surface Pulse");
    JPanel surfacePulsePanel = new JPanel();
    JButton surfaceVata = new JButton("Vata");
    JPanel surfaceVataPanel = new JPanel();
    JButton surfacePitta = new JButton("Pitta");
    JPanel surfacePittaPanel = new JPanel();
    JButton surfaceKapha = new JButton("Kapha");
    JPanel surfaceKaphaPanel = new JPanel();
    JPanel fifthPanel = new JPanel();
    JLabel vataPulse = new JLabel("Vata Pulse");
    JPanel vataLabelPanel = new JPanel();
    JLabel intensityLabel = new JLabel("Intensity");
    String[] intensity = {"1", "2", "3"};
    JList intensityList = new JList(intensity);
    JPanel intensityPanel = new JPanel();
    JLabel qualitiesLabel = new JLabel("Qualities");
    JPanel qualitiesPanel = new JPanel();
    JButton vataQualities1 = new JButton("Vata");
    JPanel vataQualitiesPanel = new JPanel();
    JButton pittaQualities1 = new JButton("Pitta");
    JPanel pittaQualitiesPanel = new JPanel();
    JButton kaphaQualities1 = new JButton("Kapha");
    JPanel kaphaQualitiesPanel = new JPanel();
    JButton allQualities = new JButton("All");
    JPanel allQualitiesPanel = new JPanel();
    JPanel sixthPanel = new JPanel();
    JLabel vataQualitiesLabel = new JLabel("Vata Qualities");
    JPanel mainVataQualitiesLabelPanel = new JPanel();
    //JPanel leftBufferPanel = new JPanel();
    JRadioButton dry = new JRadioButton("Dry");
    JRadioButton cold = new JRadioButton("Cold");
    JRadioButton light = new JRadioButton("Light");
    JRadioButton subtle = new JRadioButton("Subtle-Minute");
    JRadioButton movement = new JRadioButton("Movement");
    JRadioButton clear = new JRadioButton("Clear-Nonsticky");
    JRadioButton coarse = new JRadioButton("Coarse");
    JRadioButton brittle = new JRadioButton("Brittle");
    JPanel otherOptionsPanel1 = new JPanel();
    JButton vataQualities2 = new JButton("Vata Qualities");
    JButton vataQualities3 = new JButton("Vata Qualities");
    JButton pittaQualities2 = new JButton("Pitta Qualities");
    JButton pittaQualities3 = new JButton("Pitta Qualities");
    JButton kaphaQualities2 = new JButton("Kapha Qualities");
    JButton kaphaQualities3 = new JButton("Kapha Qualities");
    //JButton finishQualities = new JButton("Set Qualities");
    JPanel vataRadioButtonsPanel = new JPanel();
    JButton completeSurfacePulse = new JButton("CompleteReading");
    JLabel pittaPulse = new JLabel("Pitta Pulse");
    JPanel pittaLabelPanel = new JPanel();
    JPanel seventhPanel = new JPanel();
    JLabel pittaQualitiesLabel = new JLabel();
    JLabel kaphaPulse = new JLabel("Kapha Pulse");
    JPanel kaphaLabelPanel = new JPanel();
    JPanel eighthPanel = new JPanel();
    JLabel kaphaQualitiesLabel = new JLabel();
    JPanel ninthPanel = new JPanel();
    JLabel allQualitiesLabel = new JLabel();
    ArrayList<String> vataQualitiesList = new ArrayList<>();
    ArrayList<String> pittaaQualitiesList = new ArrayList<>();
    ArrayList<String> kaphaQualitiesList = new ArrayList<>();
    String currentDosha;
    String finalOutput;
    String qualitiesForFinal;

    public static void main(String[] args) {
        SelfPulseApp sp = new SelfPulseApp();
        sp.initialSetup();
        sp.dateAndTime();
    }

    public void initialSetup() {

        frame.setSize(dim1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(firstPanel);

        firstPanel.setSize(dim1);
        firstPanel.setBackground(background);  // NOT WORKING?
        firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));
        firstPanel.setVisible(true);

    }

    public void dateAndTime() {

        topPanel.setSize(600, 600);                  // NOT WORKING?
        topPanel.setBackground(background);
        title.setFont(header);
        topPanel.add(title);
        firstPanel.add(topPanel);

        currentPulse.setFont(bigFont);
        currentPulsePanel.add(currentPulse);
        currentPulsePanel.setBackground(background);
        bottomPanel.add(currentPulsePanel);

        changeDate.setFont(bigFont);
        changeDatePanel.add(changeDate);
        changeDatePanel.setBackground(background);
        bottomPanel.add(changeDatePanel);

        changeTime.setFont(bigFont);
        changeTimePanel.add(changeTime);
        changeTimePanel.setBackground(background);
        bottomPanel.add(changeTimePanel);

        firstPanel.add(bottomPanel);

        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));

        currentPulse.addActionListener(new CurrentPulse());

        changeDate.addActionListener(new ChangeDateAndTime());
        changeTime.addActionListener(new ChangeDateAndTime());

    }

    public class CurrentPulse implements ActionListener {

        Date current = new Date();
        Calendar c = Calendar.getInstance();

        @Override
        public void actionPerformed(ActionEvent ae) {

            c.setTime(current);
            makePretty(c);
            doshaTime(c);
            dayOfWeek(c);
            season(c);
            title.setVisible(false);
            currentPulse.setVisible(false);
            changeDate.setVisible(false);
            changeTime.setVisible(false);
            firstPanel.setVisible(false);
            frame.repaint();
            food();

        }

        public void makePretty(Calendar cal) {
            String s = String.format("%tc", cal);
            finalOutput = s + "\n";
        }

        public void doshaTime(Calendar cal) {
            String s = String.format("%tI", cal);
            if (s.equals("10") || s.equals("11") || s.equals("12") || s.equals("01")) {
                finalOutput += "Time is Pitta.\n";
            } else if (s.equals("02") || s.equals("03") || s.equals("04") || s.equals("05")) {
                finalOutput += "Time is Vata.\n";
            } else if (s.equals("06") || s.equals("07") || s.equals("08") || s.equals("09")) {
                finalOutput += "Time is Kapha.\n";
            }
        }

        public void dayOfWeek(Calendar cal) {
            String s = String.format("%tA", cal);
            if (s.equals("Sunday")) {
                finalOutput += "Day of Week is Pitta.\n";
            } else if (s.equals("Monday")) {
                finalOutput += "Day of Week is Kapha-Vata.\n";
            } else if (s.equals("Tuesday")) {
                finalOutput += "Day of Week is Pitta.\n";
            } else if (s.equals("Wednesday")) {
                finalOutput += "Day of Week is Vata-Pitta-Kapha.\n";
            } else if (s.equals("Thursday")) {
                finalOutput += "Day of Week is Kapha.\n";
            } else if (s.equals("Friday")) {
                finalOutput += "Day of Week is Vata-Kapha.\n";
            } else if (s.equals("Saturday")) {
                finalOutput += "Day of Week is Vata.\n";
            }
        }

        public void season(Calendar cal) {
            String s = String.format("%tB", cal);
            if (s.equals("January") || s.equals("February") || s.equals("July")
                    || s.equals("August") || s.equals("November") || s.equals("December")) {
                finalOutput += "Season is Vata.\n";
            } else if (s.equals("March") || s.equals("April")) {
                finalOutput += "Season is Kapha.\n";
            } else if (s.equals("May") || s.equals("June") || s.equals("September")
                    || s.equals("October")) {
                finalOutput += "Season is Pitta.\n";
            }

        }
    }

    private class ChangeDateAndTime implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            title.setVisible(false);
            currentPulse.setVisible(false);
            changeDate.setVisible(false);
            changeTime.setVisible(false);
            frame.repaint();

            frame.setContentPane(thirdPanel);
            thirdPanel.setSize(dim1);
            thirdPanel.setBackground(background);

            newDate.setFont(header);
            month.setFont(bigFont);
            day.setFont(bigFont);
            year.setFont(bigFont);
            datePanel.setBackground(background);
            datePanel.add(newDate);
            datePanel.add(month);
            datePanel.add(day);
            datePanel.add(year);
            thirdPanel.add(datePanel);

            newHour.setFont(header);
            newMinute.setFont(header);
            hour.setFont(bigFont);
            minute.setFont(bigFont);
            ampm.setFont(bigFont);
            timePanel.setBackground(background);
            timePanel.add(newHour);
            timePanel.add(hour);
            timePanel.add(newMinute);
            timePanel.add(minute);
            timePanel.add(ampm);
            thirdPanel.add(timePanel);

            makeChange.setFont(header);
            makeChangePanel.add(makeChange);
            makeChangePanel.setBackground(background);
            thirdPanel.add(makeChangePanel);

            thirdPanel.setLayout(new BoxLayout(thirdPanel, BoxLayout.Y_AXIS));

            newCal.set(newCal.SECOND, 00);

            month.addActionListener(new monthChange());
            day.addActionListener(new dayChange());
            year.addActionListener(new yearChange());

            hour.addActionListener(new hourChange());
            minute.addActionListener(new minuteChange());
            ampm.addActionListener(new timeShift());

            makeChange.addActionListener(new addNewInfo());

        }

    }

    private class monthChange implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JComboBox cb = (JComboBox) ae.getSource();
            String selection = (String) cb.getSelectedItem();

            if (selection.equals("January")) {
                newCal.set(newCal.MONTH, 0);
            } else if (selection.equals("February")) {
                newCal.set(newCal.MONTH, 1);
            } else if (selection.equals("March")) {
                newCal.set(newCal.MONTH, 2);
            } else if (selection.equals("April")) {
                newCal.set(newCal.MONTH, 3);
            } else if (selection.equals("May")) {
                newCal.set(newCal.MONTH, 4);
            } else if (selection.equals("June")) {
                newCal.set(newCal.MONTH, 5);
            } else if (selection.equals("July")) {
                newCal.set(newCal.MONTH, 6);
            } else if (selection.equals("August")) {
                newCal.set(newCal.MONTH, 7);
            } else if (selection.equals("September")) {
                newCal.set(newCal.MONTH, 8);
            } else if (selection.equals("October")) {
                newCal.set(newCal.MONTH, 9);
            } else if (selection.equals("November")) {
                newCal.set(newCal.MONTH, 10);
            } else if (selection.equals("December")) {
                newCal.set(newCal.MONTH, 11);
            }

        }
    }

    private class dayChange implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JComboBox cb = (JComboBox) ae.getSource();
            String selection = (String) cb.getSelectedItem();

            if (selection.equals("1")) {
                newCal.set(newCal.DATE, 1);
            } else if (selection.equals("2")) {
                newCal.set(newCal.DATE, 2);
            } else if (selection.equals("3")) {
                newCal.set(newCal.DATE, 3);
            } else if (selection.equals("4")) {
                newCal.set(newCal.DATE, 4);
            } else if (selection.equals("5")) {
                newCal.set(newCal.DATE, 5);
            } else if (selection.equals("6")) {
                newCal.set(newCal.DATE, 6);
            } else if (selection.equals("7")) {
                newCal.set(newCal.DATE, 7);
            } else if (selection.equals("8")) {
                newCal.set(newCal.DATE, 8);
            } else if (selection.equals("9")) {
                newCal.set(newCal.DATE, 9);
            } else if (selection.equals("10")) {
                newCal.set(newCal.DATE, 10);
            } else if (selection.equals("11")) {
                newCal.set(newCal.DATE, 11);
            } else if (selection.equals("12")) {
                newCal.set(newCal.DATE, 12);
            } else if (selection.equals("13")) {
                newCal.set(newCal.DATE, 13);
            } else if (selection.equals("14")) {
                newCal.set(newCal.DATE, 14);
            } else if (selection.equals("15")) {
                newCal.set(newCal.DATE, 15);
            } else if (selection.equals("16")) {
                newCal.set(newCal.DATE, 16);
            } else if (selection.equals("17")) {
                newCal.set(newCal.DATE, 17);
            } else if (selection.equals("18")) {
                newCal.set(newCal.DATE, 18);
            } else if (selection.equals("19")) {
                newCal.set(newCal.DATE, 19);
            } else if (selection.equals("20")) {
                newCal.set(newCal.DATE, 20);
            } else if (selection.equals("21")) {
                newCal.set(newCal.DATE, 21);
            } else if (selection.equals("22")) {
                newCal.set(newCal.DATE, 22);
            } else if (selection.equals("23")) {
                newCal.set(newCal.DATE, 23);
            } else if (selection.equals("24")) {
                newCal.set(newCal.DATE, 24);
            } else if (selection.equals("25")) {
                newCal.set(newCal.DATE, 25);
            } else if (selection.equals("26")) {
                newCal.set(newCal.DATE, 26);
            } else if (selection.equals("27")) {
                newCal.set(newCal.DATE, 27);
            } else if (selection.equals("28")) {
                newCal.set(newCal.DATE, 28);
            } else if (selection.equals("29")) {
                newCal.set(newCal.DATE, 29);
            } else if (selection.equals("30")) {
                newCal.set(newCal.DATE, 30);
            } else if (selection.equals("31")) {
                newCal.set(newCal.DATE, 31);
            }
        }
    }

    private class yearChange implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JComboBox cb = (JComboBox) ae.getSource();
            String selection = (String) cb.getSelectedItem();

            if (selection.equals("2015")) {
                newCal.set(newCal.YEAR, 2015);
            } else if (selection.equals("2016")) {
                newCal.set(newCal.YEAR, 2016);
            } else if (selection.equals("2017")) {
                newCal.set(newCal.YEAR, 2017);
            } else if (selection.equals("2018")) {
                newCal.set(newCal.YEAR, 2018);
            } else if (selection.equals("2019")) {
                newCal.set(newCal.YEAR, 2019);
            } else if (selection.equals("2020")) {
                newCal.set(newCal.YEAR, 2020);
            }
        }
    }

    private class hourChange implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JComboBox cb = (JComboBox) ae.getSource();
            String selection = (String) cb.getSelectedItem();

            if (selection.equals("1")) {
                newCal.set(newCal.HOUR_OF_DAY, 1);
            } else if (selection.equals("2")) {
                newCal.set(newCal.HOUR_OF_DAY, 2);
            } else if (selection.equals("3")) {
                newCal.set(newCal.HOUR_OF_DAY, 3);
            } else if (selection.equals("4")) {
                newCal.set(newCal.HOUR_OF_DAY, 4);
            } else if (selection.equals("5")) {
                newCal.set(newCal.HOUR_OF_DAY, 5);
            } else if (selection.equals("6")) {
                newCal.set(newCal.HOUR_OF_DAY, 6);
            } else if (selection.equals("7")) {
                newCal.set(newCal.HOUR_OF_DAY, 7);
            } else if (selection.equals("8")) {
                newCal.set(newCal.HOUR_OF_DAY, 8);
            } else if (selection.equals("9")) {
                newCal.set(newCal.HOUR_OF_DAY, 9);
            } else if (selection.equals("10")) {
                newCal.set(newCal.HOUR_OF_DAY, 10);
            } else if (selection.equals("11")) {
                newCal.set(newCal.HOUR_OF_DAY, 11);
            } else if (selection.equals("12")) {
                newCal.set(newCal.HOUR_OF_DAY, 12);
            }

        }
    }

    private class minuteChange implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JComboBox cb = (JComboBox) ae.getSource();
            String selection = (String) cb.getSelectedItem();

            if (selection.equals("00")) {
                newCal.set(newCal.MINUTE, 0);
            } else if (selection.equals("01")) {
                newCal.set(newCal.MINUTE, 1);
            } else if (selection.equals("02")) {
                newCal.set(newCal.MINUTE, 2);
            } else if (selection.equals("03")) {
                newCal.set(newCal.MINUTE, 3);
            } else if (selection.equals("04")) {
                newCal.set(newCal.MINUTE, 4);
            } else if (selection.equals("05")) {
                newCal.set(newCal.MINUTE, 5);
            } else if (selection.equals("06")) {
                newCal.set(newCal.MINUTE, 6);
            } else if (selection.equals("07")) {
                newCal.set(newCal.MINUTE, 7);
            } else if (selection.equals("08")) {
                newCal.set(newCal.MINUTE, 8);
            } else if (selection.equals("09")) {
                newCal.set(newCal.MINUTE, 9);
            } else if (selection.equals("10")) {
                newCal.set(newCal.MINUTE, 10);
            } else if (selection.equals("11")) {
                newCal.set(newCal.MINUTE, 11);
            } else if (selection.equals("12")) {
                newCal.set(newCal.MINUTE, 12);
            } else if (selection.equals("13")) {
                newCal.set(newCal.MINUTE, 13);
            } else if (selection.equals("14")) {
                newCal.set(newCal.MINUTE, 14);
            } else if (selection.equals(" 15")) {
                newCal.set(newCal.MINUTE, 15);
            } else if (selection.equals(" 16")) {
                newCal.set(newCal.MINUTE, 16);
            } else if (selection.equals(" 17")) {
                newCal.set(newCal.MINUTE, 17);
            } else if (selection.equals(" 18")) {
                newCal.set(newCal.MINUTE, 18);
            } else if (selection.equals(" 19")) {
                newCal.set(newCal.MINUTE, 19);
            } else if (selection.equals(" 20")) {
                newCal.set(newCal.MINUTE, 20);
            } else if (selection.equals(" 21")) {
                newCal.set(newCal.MINUTE, 21);
            } else if (selection.equals(" 22")) {
                newCal.set(newCal.MINUTE, 22);
            } else if (selection.equals(" 23")) {
                newCal.set(newCal.MINUTE, 23);
            } else if (selection.equals(" 24")) {
                newCal.set(newCal.MINUTE, 24);
            } else if (selection.equals(" 25")) {
                newCal.set(newCal.MINUTE, 25);
            } else if (selection.equals(" 26")) {
                newCal.set(newCal.MINUTE, 26);
            } else if (selection.equals(" 27")) {
                newCal.set(newCal.MINUTE, 27);
            } else if (selection.equals(" 28")) {
                newCal.set(newCal.MINUTE, 28);
            } else if (selection.equals(" 29")) {
                newCal.set(newCal.MINUTE, 29);
            } else if (selection.equals(" 30")) {
                newCal.set(newCal.MINUTE, 30);
            } else if (selection.equals(" 31")) {
                newCal.set(newCal.MINUTE, 31);
            } else if (selection.equals(" 32")) {
                newCal.set(newCal.MINUTE, 32);
            } else if (selection.equals(" 33")) {
                newCal.set(newCal.MINUTE, 33);
            } else if (selection.equals(" 34")) {
                newCal.set(newCal.MINUTE, 34);
            } else if (selection.equals(" 35")) {
                newCal.set(newCal.MINUTE, 35);
            } else if (selection.equals(" 36")) {
                newCal.set(newCal.MINUTE, 36);
            } else if (selection.equals(" 37")) {
                newCal.set(newCal.MINUTE, 37);
            } else if (selection.equals(" 38")) {
                newCal.set(newCal.MINUTE, 38);
            } else if (selection.equals(" 39")) {
                newCal.set(newCal.MINUTE, 39);
            } else if (selection.equals(" 40")) {
                newCal.set(newCal.MINUTE, 40);
            } else if (selection.equals(" 41")) {
                newCal.set(newCal.MINUTE, 41);
            } else if (selection.equals(" 42")) {
                newCal.set(newCal.MINUTE, 42);
            } else if (selection.equals(" 43")) {
                newCal.set(newCal.MINUTE, 43);
            } else if (selection.equals(" 44")) {
                newCal.set(newCal.MINUTE, 44);
            } else if (selection.equals(" 45")) {
                newCal.set(newCal.MINUTE, 45);
            } else if (selection.equals(" 46")) {
                newCal.set(newCal.MINUTE, 46);
            } else if (selection.equals(" 47")) {
                newCal.set(newCal.MINUTE, 47);
            } else if (selection.equals(" 48")) {
                newCal.set(newCal.MINUTE, 48);
            } else if (selection.equals(" 49")) {
                newCal.set(newCal.MINUTE, 49);
            } else if (selection.equals(" 50")) {
                newCal.set(newCal.MINUTE, 50);
            } else if (selection.equals(" 51")) {
                newCal.set(newCal.MINUTE, 51);
            } else if (selection.equals(" 52")) {
                newCal.set(newCal.MINUTE, 52);
            } else if (selection.equals(" 53")) {
                newCal.set(newCal.MINUTE, 53);
            } else if (selection.equals(" 54")) {
                newCal.set(newCal.MINUTE, 54);
            } else if (selection.equals(" 55")) {
                newCal.set(newCal.MINUTE, 55);
            } else if (selection.equals(" 56")) {
                newCal.set(newCal.MINUTE, 56);
            } else if (selection.equals(" 57")) {
                newCal.set(newCal.MINUTE, 57);
            } else if (selection.equals(" 58")) {
                newCal.set(newCal.MINUTE, 58);
            } else if (selection.equals(" 59")) {
                newCal.set(newCal.MINUTE, 59);
            }
        }
    }

    private class timeShift implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            JComboBox cb = (JComboBox) ae.getSource();
            String selection = (String) cb.getSelectedItem();

            if (selection.equals("PM")) {
                newCal.add(newCal.HOUR_OF_DAY, 12);
            }

        }
    }

    private class addNewInfo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            makePretty(newCal);
            doshaTime(newCal);
            dayOfWeek(newCal);
            season(newCal);
            newDate.setVisible(false);
            newHour.setVisible(false);
            newMinute.setVisible(false);
            month.setVisible(false);
            day.setVisible(false);
            year.setVisible(false);
            hour.setVisible(false);
            minute.setVisible(false);
            ampm.setVisible(false);
            firstPanel.setVisible(false);
            frame.repaint();
            food();
        }

        public void makePretty(Calendar cal) {
            String s = String.format("%tc", cal);
            finalOutput = s + "\n";
        }

        public void doshaTime(Calendar cal) {
            String s = String.format("%tI", cal);
            if (s.equals("10") || s.equals("11") || s.equals("12") || s.equals("01")) {
                finalOutput += "Time is Pitta.\n";
            } else if (s.equals("02") || s.equals("03") || s.equals("04") || s.equals("05")) {
                finalOutput += "Time is Vata.\n";
            } else if (s.equals("06") || s.equals("07") || s.equals("08") || s.equals("09")) {
                finalOutput += "Time is Kapha.\n";
            }
        }

        public void dayOfWeek(Calendar cal) {
            String s = String.format("%tA", cal);
            if (s.equals("Sunday")) {
                finalOutput += "Day of Week is Pitta.\n";
            } else if (s.equals("Monday")) {
                finalOutput += "Day of Week is Kapha-Vata.\n";
            } else if (s.equals("Tuesday")) {
                finalOutput += "Day of Week is Pitta.\n";
            } else if (s.equals("Wednesday")) {
                finalOutput += "Day of Week is Vata-Pitta-Kapha.\n";
            } else if (s.equals("Thursday")) {
                finalOutput += "Day of Week is Kapha.\n";
            } else if (s.equals("Friday")) {
                finalOutput += "Day of Week is Vata-Kapha.\n";
            } else if (s.equals("Saturday")) {
                finalOutput += "Day of Week is Vata.\n";
            }
        }

        public void season(Calendar cal) {
            String s = String.format("%tB", cal);
            if (s.equals("January") || s.equals("February") || s.equals("July")
                    || s.equals("August") || s.equals("November") || s.equals("December")) {
                finalOutput += "Season is Vata.\n";
            } else if (s.equals("March") || s.equals("April")) {
                finalOutput += "Season is Kapha.\n";
            } else if (s.equals("May") || s.equals("June") || s.equals("September")
                    || s.equals("October")) {
                finalOutput += "Season is Pitta.\n";
            }

        }

    }

    public void food() {

        frame.setContentPane(secondPanel);
        secondPanel.setSize(dim1);
        secondPanel.setBackground(background);

        question.setFont(header);
        questionPanel.setBackground(background);
        questionPanel.add(question);
        secondPanel.add(questionPanel);

        oneHour.setFont(bigFont);
        oneHourPanel.setBackground(background);
        oneHourPanel.add(oneHour);
        secondPanel.add(oneHourPanel);

        twoHour.setFont(bigFont);
        twoHourPanel.setBackground(background);
        twoHourPanel.add(twoHour);
        secondPanel.add(twoHourPanel);

        threeHour.setFont(bigFont);
        threeHourPanel.setBackground(background);
        threeHourPanel.add(threeHour);
        secondPanel.add(threeHourPanel);

        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));

        oneHour.addActionListener(new FoodButton());
        twoHour.addActionListener(new FoodButton());
        threeHour.addActionListener(new FoodButton());
    }

    private class FoodButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource().equals(oneHour)) {
                finalOutput += "Time since eaten is Pitta.\n";
            } else if (ae.getSource().equals(twoHour)) {
                finalOutput += "Time since eaten is Kapha.\n";
            } else if (ae.getSource().equals(threeHour)) {
                finalOutput += "Time since eaten is Vata.\n";
            }

            question.setVisible(false);
            oneHour.setVisible(false);
            twoHour.setVisible(false);
            threeHour.setVisible(false);
            frame.repaint();
            surfacePulse();
        }

    }

    public void surfacePulse() {

        frame.setContentPane(fourthPanel);
        fourthPanel.setSize(dim1);
        fourthPanel.setBackground(background);

        surfacePulse.setFont(header);
        surfacePulsePanel.setBackground(background);
        surfacePulsePanel.add(surfacePulse);
        fourthPanel.add(surfacePulsePanel);

        surfaceVata.setFont(bigFont);
        surfaceVataPanel.setBackground(background);
        surfaceVataPanel.add(surfaceVata);
        fourthPanel.add(surfaceVataPanel);

        surfacePitta.setFont(bigFont);
        surfacePittaPanel.setBackground(background);
        surfacePittaPanel.add(surfacePitta);
        fourthPanel.add(surfacePittaPanel);

        surfaceKapha.setFont(bigFont);
        surfaceKaphaPanel.setBackground(background);
        surfaceKaphaPanel.add(surfaceKapha);
        fourthPanel.add(surfaceKaphaPanel);

        fourthPanel.setLayout(new BoxLayout(fourthPanel, BoxLayout.Y_AXIS));

        finalOutput += "Surface Pulse:\n";

        surfaceVata.addActionListener(new vataDosha());
//        surfacePitta.addActionListener(new pittaDosha());
//        surfaceKapha.addActionListener(new kaphaDosha());
    }

    private class vataDosha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            currentDosha = "Vata";

            surfacePulse.setVisible(false);
            surfaceVata.setVisible(false);
            surfacePitta.setVisible(false);
            surfaceKapha.setVisible(false);
            frame.repaint();

            frame.setContentPane(fifthPanel);
            fifthPanel.setSize(dim1);
            fifthPanel.setBackground(background);

            vataPulse.setFont(header);
            vataLabelPanel.setBackground(background);
            vataLabelPanel.add(vataPulse);
            fifthPanel.add(vataLabelPanel);

            intensityLabel.setFont(bigFont);
            intensityList.setFont(bigFont);
            // intensityList.setSelectionModel(ListSelectionModel.SINGLE_SELECTION);
            intensityList.setLayoutOrientation(JList.HORIZONTAL_WRAP); // Not working?
            intensityPanel.setBackground(background);
            intensityPanel.add(intensityLabel);
            intensityPanel.add(intensityList);
            fifthPanel.add(intensityPanel);

            qualitiesLabel.setFont(bigFont);
            qualitiesPanel.setBackground(background);
            qualitiesPanel.add(qualitiesLabel);
            fifthPanel.add(qualitiesPanel);

            vataQualities1.setFont(medFont);
            vataQualitiesPanel.setBackground(background);
            vataQualitiesPanel.add(vataQualities1);
            fifthPanel.add(vataQualitiesPanel);

            pittaQualities1.setFont(medFont);
            pittaQualitiesPanel.setBackground(background);
            pittaQualitiesPanel.add(pittaQualities1);
            fifthPanel.add(pittaQualitiesPanel);

            kaphaQualities1.setFont(medFont);
            kaphaQualitiesPanel.setBackground(background);
            kaphaQualitiesPanel.add(kaphaQualities1);
            fifthPanel.add(kaphaQualitiesPanel);

            allQualities.setFont(medFont);
            allQualitiesPanel.setBackground(background);
            allQualitiesPanel.add(allQualities);
            fifthPanel.add(allQualitiesPanel);

            fifthPanel.setLayout(new BoxLayout(fifthPanel, BoxLayout.Y_AXIS));

            intensityList.addListSelectionListener(new IntensityNumber());
            vataQualities1.addActionListener(new VataQualities());
            pittaQualities1.addActionListener(new PittaQualities());
            kaphaQualities1.addActionListener(new KaphaQualities());
            allQualities.addActionListener(new AllQualities());

        }

    }

    private class IntensityNumber implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            if (!lse.getValueIsAdjusting()) {
                String selection = (String) intensityList.getSelectedValue();
                finalOutput += "\t" + currentDosha + " intensity is " + selection + ".\n";
            }
        }

    }

    private class VataQualities implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            currentDosha = "Vata";
            finalOutput += "\t" + currentDosha + " qualities are ";

            qualitiesLabel.setVisible(false);
            intensityLabel.setVisible(false);
            intensityList.setVisible(false);
            vataQualities1.setVisible(false);
            pittaQualities1.setVisible(false);
            kaphaQualities1.setVisible(false);
            frame.repaint();

            frame.setContentPane(sixthPanel);
            sixthPanel.setSize(dim1);
            sixthPanel.setBackground(background);

            vataQualitiesLabel.setFont(header);
            mainVataQualitiesLabelPanel.setBackground(background);
            mainVataQualitiesLabelPanel.add(vataQualitiesLabel);
            sixthPanel.add(mainVataQualitiesLabelPanel);

            dry.setFont(medFont);
            dry.setBackground(background);
            cold.setFont(medFont);
            cold.setBackground(background);
            light.setFont(medFont);
            light.setBackground(background);
            subtle.setFont(medFont);
            subtle.setBackground(background);
            movement.setFont(medFont);
            movement.setBackground(background);
            clear.setFont(medFont);
            clear.setBackground(background);
            coarse.setFont(medFont);
            coarse.setBackground(background);
            brittle.setFont(medFont);
            brittle.setBackground(background);
            vataRadioButtonsPanel.setBackground(background);
            vataRadioButtonsPanel.add(dry);
            vataRadioButtonsPanel.add(cold);
            vataRadioButtonsPanel.add(light);
            vataRadioButtonsPanel.add(subtle);
            vataRadioButtonsPanel.add(movement);
            vataRadioButtonsPanel.add(clear);
            vataRadioButtonsPanel.add(coarse);
            vataRadioButtonsPanel.add(brittle);
            sixthPanel.add(vataRadioButtonsPanel);

            pittaQualities2.setFont(bigFont);
            kaphaQualities2.setFont(bigFont);
            completeSurfacePulse.setFont(bigFont);
            otherOptionsPanel1.setBackground(background);
            otherOptionsPanel1.add(pittaQualities2);
            otherOptionsPanel1.add(kaphaQualities2);
            otherOptionsPanel1.add(completeSurfacePulse);
            sixthPanel.add(otherOptionsPanel1);

            vataRadioButtonsPanel.setLayout(new BoxLayout(vataRadioButtonsPanel, BoxLayout.Y_AXIS));
            sixthPanel.setLayout(new BoxLayout(sixthPanel, BoxLayout.Y_AXIS));

            dry.addActionListener(new Qualities());
            cold.addActionListener(new Qualities());
            light.addActionListener(new Qualities());
            subtle.addActionListener(new Qualities());
            movement.addActionListener(new Qualities());
            clear.addActionListener(new Qualities());
            coarse.addActionListener(new Qualities());
            brittle.addActionListener(new Qualities());
            //finishQualities.addActionListener(new StringQualities())
            completeSurfacePulse.addActionListener(new CompleteSurfacePulse());

        }

    }

    private class Qualities implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (currentDosha == "Vata") {
                JRadioButton rb = (JRadioButton) ae.getSource();
                String selection = (String) rb.getText();
                vataQualitiesList.add(selection);
            }

        }

    }

    private class PittaQualities implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }

    }

    private class KaphaQualities implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }

    }

    private class AllQualities implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }

    }

    private class CompleteSurfacePulse implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            
            
            pittaQualities2.setVisible(false);
            kaphaQualities2.setVisible(false);
            completeSurfacePulse.setVisible(false);
            vataQualitiesLabel.setVisible(false);
            dry.setVisible(false);
            cold.setVisible(false);
            light.setVisible(false);
            subtle.setVisible(false);
            movement.setVisible(false);
            clear.setVisible(false);
            coarse.setVisible(false);
            brittle.setVisible(false);
            frame.repaint();

            if (vataQualitiesList.size() > 1) {
                for (int i = 0; i < vataQualitiesList.size(); i++) {
                    if (i == 0) {
                        finalOutput += vataQualitiesList.get(i) + ", ";
                    } else if (i == (vataQualitiesList.size() - 1)) {
                        finalOutput += vataQualitiesList.get(i) + ".\n";
                    } else {
                        for (int j = 1; j < (vataQualitiesList.size() - 1); j++) {
                            finalOutput += vataQualitiesList.get(j) + ", ";
                        }
                    }
                }
            } else {
                finalOutput += vataQualitiesList.get(0) + ".\n";
            }
            System.out.println(finalOutput);
        }

    }
}
