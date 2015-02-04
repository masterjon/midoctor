package com.midoctor.proyectdoc2;


import java.util.ArrayList;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListaMedicosActivity extends Activity {
	private  ListView ListViewopction;
	private ArrayList<classespecialidades> fetch = new ArrayList<classespecialidades>();
	private adapterdirectorio adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_medicos);
		
		
		ListViewopction = (ListView) findViewById(R.id.listView2);
		
		
		 Bundle extras = getIntent().getExtras();
		 String especialidad = extras.getString("especialidad");
		 TextView tv_title = (TextView) findViewById(R.id.tv_header);
		ImageView img = (ImageView) findViewById(R.id.icono_mascota);
		TextView tv_content = (TextView) findViewById(R.id.doc_info);
		 if(especialidad.equals("alergologo")){
				tv_title.setText("Alerg�logo");
				img.setBackgroundResource(R.drawable.mascota_alergologo);
				tv_content.setText("Es el medico especializado en el diagnostico y tratamiento de las enfermedades  al�rgicas, as� como alergia a medicamentos y alimentos. Enfermedades que trata: Rinitis al�rgica, asma, urticaria. Dermatitis al�rgica, alergia a insectos");
		 }
		 else if(especialidad.equals("audiologo")){
				tv_title.setText("Audiol�go");
				img.setBackgroundResource(R.drawable.mascota_audiologo);
				tv_content.setText("Es el medico especializado en el tratamiento, diagnostico y rehabilitaci�n de los problemas y discapacidades auditivas. \n Enfermedades que trata:  otitis media, zumbido de o�dos, perdida de la audici�n, v�rtigo, mareo.");
		 }else if(especialidad.equals("cardiologo")){
				tv_title.setText("Cardi�logo");
				img.setBackgroundResource(R.drawable.mascota_cardio);
				tv_content.setText("El cardi�logo es el especialista medico encargado de atender las enfermedades relacionadas con el coraz�n y el aparato circulatorio. Enfermedades que trata: hipertensi�n arterial, insuficiencia cardiaca, pericarditis, endocarditis.");
		 }else if(especialidad.equals("cirujano")){
				tv_title.setText("Cirujano");
				img.setBackgroundResource(R.drawable.mascota_cirujano);
				tv_content.setText("M�dico especialista  en  prevenir,  diagnosticar y curar diversos padecimientos a trav�s de la realizaci�n de cirug�as.\n Padecimientos quir�rgicos: Dependiendo del aparato � sistema afectado es el especialista en realizar cirug�as.");
		 }else if(especialidad.equals("dermatologo")){
				tv_title.setText("Dermat�logo");
				img.setBackgroundResource(R.drawable.mascota_dermatologo);
				tv_content.setText("Es el medico especializado en los padecimiento de la piel, ofrece diagnostico, prevenci�n y tratamiento.\n Enfermedades que trata:  acne, dermatitis, comez�n.");
		 }else if(especialidad.equals("endocrinologo")){
				tv_title.setText("Endocrin�logo");
				img.setBackgroundResource(R.drawable.mascota_endocrinologo);
				tv_content.setText("Es el medico especializado en las enfermedades hormonales, del metabolismo y de los problemas alimenticios o de nutrici�n. Enfermedades que trata: diabetes, menopausia, obesidad.");
		 }else if(especialidad.equals("gastro")){
				tv_title.setText("Gastroenter�logo");
				img.setBackgroundResource(R.drawable.mascota_gastro);
				tv_content.setText("M�dico especialista en tratar  y prevenir enfermedades  de tubo digestivo. Enfermedades que trata: Gastritis, esofagitis, colon irritable, problemas del h�gado , problemas de digesti�n.");
				classespecialidades one = new
						classespecialidades("1","Dr. Ra�l Barrag�n Parrao","Gastroenter�logo","998 8980801","raulbapa@hotmail.com",especialidad,"", "",
						"Av Tulum Lote 1 mza 1 �consultorio �315 � � �SM 12");
				fetch.add(one);
				
		 }else if(especialidad.equals("ginecologo")){
				tv_title.setText("Ginec�logo");
				img.setBackgroundResource(R.drawable.mascota_ginecologo);
				tv_content.setText("Gineco-obstetra: es el especialista medico encargado del proceso del embarazo, del parto, del puerperio y del tiempo posterior al parto. Enfermedades que trata: enfermedades del adolescente, mujer adulta, y todos aspectos de la salud femenina.");
		 }else if(especialidad.equals("hematologo")){
				tv_title.setText("Hemat�logo");
				img.setBackgroundResource(R.drawable.mascota_hematologo);
				tv_content.setText("Es el especializado medico encargado del diagnostico y tratamiento de las enfermedades y trastornos de la sangre. Enfermedades que trata: leucemia, anemia, linfomas, trastornos hemorr�gicos.");
		 }else if(especialidad.equals("inmunologo")){
				tv_title.setText("Inmun�logo");
				img.setBackgroundResource(R.drawable.mascota_inmunologo);
				tv_content.setText("Es el medico especializado en estudiar el sistema inmunitario, es decir todo lo relacionado con las defensas de nuestro organismo.\n Enfermedades que trata: lupus, artritis ,vasculitis, anemia.");
		 }else if(especialidad.equals("neurocirujano")){
				tv_title.setText("Neurocirujano");
				img.setBackgroundResource(R.drawable.mascota_neurocirujano);
				tv_content.setText("Es el profesional especializado en la cirug�a del cerebro y la columna vertebral. Enfermedades que trata: neurocisticercosis, tumores descebarles, hernias de disco.");
		 }else if(especialidad.equals("neumologo")){
				tv_title.setText("Neum�logo");
				img.setBackgroundResource(R.drawable.mascota_neumologo);
				tv_content.setText("Es el medico especializado en el estudio de las enfermedades del aparato respiratorio. Enfermedades que trata: bronquitis, enfisema pulmonar, neumon�a, fibrosis qu�stica.");
		 }else if(especialidad.equals("neurologo")){
				tv_title.setText("Neur�logo");
				img.setBackgroundResource(R.drawable.mascota_neurologo);
				tv_content.setText("Es el especialista medico encargado de monitorizar y tratar los trastornos del sistema nervioso. Enfermedades que trata: cefalea (dolor de cabeza), alzheimer, trastornos de aprendizaje.");
		 }else if(especialidad.equals("nutriologo")){
				tv_title.setText("Nutri�logo");
				img.setBackgroundResource(R.drawable.mascota_gastroenterologo);
				tv_content.setText("Es el profesional de la salud, dedicado al estudio de la alimentaci�n del ser humano y nos brinda las herramientas para tener una buena alimentaci�n. Enfermedades que trata: personas sanas que desean tener una alimentaci�n balanceada, obesidad, desnutrici�n.");
		 }else if(especialidad.equals("oncologo")){
				tv_title.setText("Onc�logo");
				img.setBackgroundResource(R.drawable.mascota_oncologo);
				tv_content.setText("Es el especialista medico encargado del an�lisis, diagnostico y tratamiento del c�ncer. Enfermedades que trata: c�ncer de mama, c�ncer de pulm�n, c�ncer de colon.");
		 }else if(especialidad.equals("ortopedista")){
				tv_title.setText("Ortopedista");
				img.setBackgroundResource(R.drawable.mascota_ortopedista);
				tv_content.setText("Es el medico especializado en la prevenci�n y tratamiento de las afecciones o traumas de huesos y m�sculos. Enfermedades que trata:  fracturas, artritis, tendosinovitis estenosante, distensi�n muscular.");
		 }else if(especialidad.equals("otorrino")){
				tv_title.setText("Otorrinolaring�logo");
				img.setBackgroundResource(R.drawable.mascota_otorrino);
				tv_content.setText("Medico especialista enfocado a las enfermedades de o�dos, nariz y garganta. Enfermedades que trata: otitis , rinitis, laringitis , traque�tis, desviaci�n septal, p�lipos nasales.");
		 }else if(especialidad.equals("psicologo")){
				tv_title.setText("Psic�logo");
				img.setBackgroundResource(R.drawable.mascota_psicologo);
				tv_content.setText("Es el profesional medico especializado en la salud mental. Enfermedades que trata: anorexia, apat�a, demencia, depresi�n.");
		 }else if(especialidad.equals("reumatologo")){
				tv_title.setText("Reumat�logo");
				img.setBackgroundResource(R.drawable.mascota_reumatologo);
				tv_content.setText("El reumat�logo es el medico especialista encargado del diagn�stico y atenci�n de las enfermedades relacionadas con el aparato locomotor es decir con cualquier malestar del cuerpo. Enfermedades que trata: artritis, osteoporosis, fibromialgia entre otras.");
		 }else if(especialidad.equals("terapiaped")){
				tv_title.setText("Terapia Intensiva Pedi�trica");
				img.setBackgroundResource(R.drawable.mascota_terapia_intensiva);
				tv_content.setText("Pediatra especialista en atender a todo ni�o en estado de terapia intensiva.");
		 }else if(especialidad.equals("urgenciasped")){
				tv_title.setText("Urgencias Pedi�tricas");
				img.setBackgroundResource(R.drawable.mascota_urgencias_pediatricas);
				tv_content.setText("Pediatra especialista en atender a todo ni�o que llegue a  cualquier servicio de urgencias");
		 }else if(especialidad.equals("urologo")){
				tv_title.setText("Ur�logo");
				img.setBackgroundResource(R.drawable.mascota_urologo);
				tv_content.setText("Es el medico especializado en el estudio de las v�as urinarias, ofrece tratamiento, prevenci�n y diagnostico a pacientes de todas las edades. Enfermedades que trata: infecci�n de v�as urinarias y enfermedades de transmisi�n sexual.");
		 }
		 
		 
		 
		 
		    adapter = new adapterdirectorio(ListaMedicosActivity.this, R.id.listView2,
					fetch);
			ListViewopction.setAdapter(adapter);
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_medicos, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
