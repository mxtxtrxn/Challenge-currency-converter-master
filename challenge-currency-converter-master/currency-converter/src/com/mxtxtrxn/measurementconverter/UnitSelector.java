package com.mxtxtrxn.measurementconverter;

import javax.swing.JOptionPane;

public class UnitSelector {
	private String selectedUnit;
	
	
	public UnitSelector(String[] unitList) {
	selectedUnit = (String) JOptionPane.showInputDialog(null,

				"Elija la divisa que quiere convertir", "Elija una divisa",

				JOptionPane.INFORMATION_MESSAGE, null,

				unitList, unitList[0]);
	}
	
	public String getSelectedUnit() {
		return selectedUnit;
	}
}
