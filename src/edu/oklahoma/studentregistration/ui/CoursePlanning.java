/*
 * Created by JFormDesigner on Sat May 21 03:54:47 IST 2016
 */

package edu.oklahoma.studentregistration.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;

/**
 * @author Aditya Molugu
 */
public class CoursePlanning extends JFrame {
	public CoursePlanning() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Aditya Molugu
		DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		button1 = new JButton();
		checkBox1 = new JCheckBox();
		checkBox2 = new JCheckBox();
		checkBox3 = new JCheckBox();
		checkBox4 = new JCheckBox();
		checkBox5 = new JCheckBox();
		checkBox6 = new JCheckBox();
		checkBox8 = new JCheckBox();
		checkBox9 = new JCheckBox();
		checkBox10 = new JCheckBox();
		checkBox11 = new JCheckBox();
		separator1 = compFactory.createSeparator("Select Courses");
		textField1 = new JTextField();
		label1 = compFactory.createLabel("Capacity");
		buttonBar = new JPanel();
		okButton = new JButton();
		separator2 = compFactory.createSeparator("text");

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

			// JFormDesigner evaluation mark
			dialogPane.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{

				//---- button1 ----
				button1.setText("Retrieve List of Courses");

				//---- checkBox1 ----
				checkBox1.setText("Course 1");

				//---- checkBox2 ----
				checkBox2.setText("Course 2");

				//---- checkBox3 ----
				checkBox3.setText("Course 3");

				//---- checkBox4 ----
				checkBox4.setText("Course 4");

				//---- checkBox5 ----
				checkBox5.setText("Course 5");

				//---- checkBox6 ----
				checkBox6.setText("Course 6");

				//---- checkBox8 ----
				checkBox8.setText("Course 7");

				//---- checkBox9 ----
				checkBox9.setText("Course 8");

				//---- checkBox10 ----
				checkBox10.setText("Course 9");

				//---- checkBox11 ----
				checkBox11.setText("Course 10");

				GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
				contentPanel.setLayout(contentPanelLayout);
				contentPanelLayout.setHorizontalGroup(
					contentPanelLayout.createParallelGroup()
						.addGroup(contentPanelLayout.createSequentialGroup()
							.addGroup(contentPanelLayout.createParallelGroup()
								.addGroup(contentPanelLayout.createSequentialGroup()
									.addContainerGap()
									.addGroup(contentPanelLayout.createParallelGroup()
										.addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox4, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox5, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(checkBox6, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
										.addComponent(checkBox8, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
										.addComponent(checkBox9, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
										.addComponent(checkBox10, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
										.addComponent(checkBox11)))
								.addComponent(separator1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(contentPanelLayout.createSequentialGroup()
									.addGap(159, 159, 159)
									.addComponent(button1)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
									.addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addGap(34, 34, 34)))
							.addContainerGap())
				);
				contentPanelLayout.setVerticalGroup(
					contentPanelLayout.createParallelGroup()
						.addGroup(contentPanelLayout.createSequentialGroup()
							.addGroup(contentPanelLayout.createParallelGroup()
								.addGroup(contentPanelLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(button1))
								.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(label1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(15, 15, 15)
							.addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPanelLayout.createParallelGroup()
								.addGroup(contentPanelLayout.createSequentialGroup()
									.addComponent(checkBox1)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(checkBox2)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(checkBox3)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(checkBox4))
								.addGroup(contentPanelLayout.createSequentialGroup()
									.addComponent(checkBox6)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(checkBox8)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(checkBox9)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(checkBox10)))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(contentPanelLayout.createParallelGroup()
								.addComponent(checkBox5)
								.addComponent(checkBox11))
							.addContainerGap(55, Short.MAX_VALUE))
				);
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
				buttonBar.setLayout(new GridBagLayout());
				((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 0};
				((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

				//---- okButton ----
				okButton.setText("Generate Schedule");
				buttonBar.add(okButton, new GridBagConstraints(2, 1, 2, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Aditya Molugu
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JButton button1;
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JCheckBox checkBox4;
	private JCheckBox checkBox5;
	private JCheckBox checkBox6;
	private JCheckBox checkBox8;
	private JCheckBox checkBox9;
	private JCheckBox checkBox10;
	private JCheckBox checkBox11;
	private JComponent separator1;
	private JTextField textField1;
	private JLabel label1;
	private JPanel buttonBar;
	private JButton okButton;
	private JComponent separator2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
