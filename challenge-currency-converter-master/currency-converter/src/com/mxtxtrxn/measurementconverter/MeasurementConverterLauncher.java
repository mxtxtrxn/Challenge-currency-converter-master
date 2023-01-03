package com.mxtxtrxn.measurementconverter;

import javax.swing.JOptionPane;

public class MeasurementConverterLauncher {
	
	public MeasurementConverterLauncher() {
		boolean endProgram = false;
		
		
		String[] arrUnits = {"Pulgadas a Centímetros","Pies a metros", "Millas a Kilómetros"};
		while(endProgram != true) {
			String strValue = JOptionPane.showInputDialog
					("Introduce el valor que deseas convertir");
			
			
			try {
				double value = Double.parseDouble(strValue);
				
				UnitSelector unitSelector = new UnitSelector(arrUnits);
				
				String selectedUnit = unitSelector.getSelectedUnit();
				
				
				double result;
				if(selectedUnit != null) {
					switch(selectedUnit) {
					case "Pulgadas a Centímetros":
						result = new MeasurementConverter().inchesToCentimeters(value);
						JOptionPane.showMessageDialog
						(null,"El resultado de la conversión es: " + result+ "cm","Resultado",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					case "Pies a metros":
						result = new MeasurementConverter().feetToMeters(value);
						JOptionPane.showMessageDialog
						(null,"El resultado de la conversión es: " + result + "m","Resultado",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					case "Millas a Kilómetros":
						result = new MeasurementConverter().milesToKilometers(value);
						JOptionPane.showMessageDialog
						(null,"El resultado de la conversión es: " + result + "km","Resultado",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					}
				}

				
				int continueProgram = JOptionPane.showConfirmDialog
						(null,"¿Desea realizar otra conversión?","Continuar",
								JOptionPane.YES_NO_OPTION);
				
				if(continueProgram == JOptionPane.NO_OPTION) {
					endProgram = true;
				}
				

			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog
					(null,"Se ha introducido un valor inválido","Error", JOptionPane.ERROR_MESSAGE, null);
				ex.printStackTrace();
			}catch(NullPointerException ex) {
				endProgram = true;
			}
			
		}
	}
	
	public void showResult(double result) {
		JOptionPane.showMessageDialog
		(null,"El resultado de la conversión es: $" + result,"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
