import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

 
public class List extends JFrame
	{
	private JList <String> mountains;
	static String mountainChoice;
	
	public List()
		{
		mountains = new JList<>(ConvertToArray.convert(SkiPreferenceSort.newMountains, 0));
		
		mountains.addListSelectionListener(new ListSelectionListener() 
		{
	    @Override
	    public void valueChanged(ListSelectionEvent e)
	    	{
	    	if(!e.getValueIsAdjusting())
	    		{
	    		mountainChoice = mountains.getSelectedValuesList().toString();
	    		}
	    	}
		});   
		
		add(new JScrollPane(mountains));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mountain List");
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		mountains.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
	
	public static void trailMap()
		{
		List mountains2 = null;
		
		SwingUtilities.invokeLater(new Runnable() 
			{
			@Override
			public void run() 
				{
				new List();
				}
			});
		
		Runner.delay();
		
		System.out.println(mountainChoice);
		
		String imageName = mountainChoice.substring(1, mountainChoice.length()-1) + ".jpg";
		System.out.println(imageName);
		
		ImageIcon image = new ImageIcon(imageName);
		
		JOptionPane.showMessageDialog(
				null, 
				mountainChoice.substring(1, mountainChoice.length()-1),
				"Hey",
				JOptionPane.CLOSED_OPTION,
				image
				);
		
		
//		BufferedImage img = null;
//		try {
//		    img = ImageIO.read(new File(imageName));
//		} catch (IOException e) {
//		}
//		
//		img
		
		}
	}
