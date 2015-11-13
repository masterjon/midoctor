package com.midoctor.proyectdoc2;

import java.util.ArrayList;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class adapterdirectorio extends ArrayAdapter<classespecialidades> {
	private ArrayList<classespecialidades> entries;
	private Activity activity;

	public adapterdirectorio(Activity a, int textViewResourceId,
			ArrayList<classespecialidades> entries) {
		super(a, textViewResourceId, entries);
		this.entries = entries;
		this.activity = a;
		
	}

	public static class ViewHolder {
		public TextView item1;
		public TextView item2;
		public TextView item3;
		public ImageButton btnEdit;
		public ImageButton btntel;
		public ImageButton btnemail;
		public ImageView btnimage;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder holder;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.listdirectorio, null);
			holder = new ViewHolder();
			holder.item1 = (TextView) v.findViewById(R.id.LblTitulo);
			holder.item2 = (TextView) v.findViewById(R.id.Lbldetail);
			holder.item3 = (TextView) v.findViewById(R.id.lblLeerMas);
		   holder.btnEdit = (ImageButton) v.findViewById(R.id.bottonubicacion);
		   holder.btntel = (ImageButton) v.findViewById(R.id.bottontel);
		   holder.btnemail= (ImageButton) v.findViewById(R.id.bottonemail);
		   holder.btnimage= (ImageView) v.findViewById(R.id.thumbtel);
		   
		   
			v.setTag(holder);
		} else
			holder = (ViewHolder) v.getTag();

		final classespecialidades so = entries.get(position);
		if (so != null) {
			holder.item1.setText(so.Name());
			holder.item2.setText(so.Detalle());
			
			
			if(so.Name().equals("Dra. Eunice May Narvaez"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_eunice_may);
			}
			else if(so.Name().equals("Dr. José Carlos Balmaceda L."))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else if(so.Name().equals("Dr. Raúl Medina Chávez"))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else if(so.Name().equals("Dra. Genny Santamaría Berrón"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_geny);
			}
			else if(so.Name().equals("Dra. Miriam Campos Rebolledo"))
			{
				holder.btnimage.setImageResource(R.drawable.doctora);
			}
			else if(so.Name().equals("Dr. Horacio Nolasco Martínez"))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else if(so.Name().equals("Dr. Omar Ernesto  Rojas Pacheco"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_omar_ernesto_rojas);
			}
			else if(so.Name().equals("Dr. Francisco Navarrete Suárez"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_navarrete);
			}
			else if(so.Name().equals("Dra. Aurora Meza Morales"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_aurora);
			}
			else if(so.Name().equals("Dr. Mauricio Peña Párraga"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_mauricio_pena);
			}
			else if(so.Name().equals("Dr. Raúl Barragán Parrao"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_raul);
			}
			else if(so.Name().equals("Dra. Mónica Callejo"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_monica_callejo);
			}
			else if(so.Name().equals("Dr. Armando Mantecón"))
			{
				holder.btnimage.setImageResource(R.drawable.logo_mantecon);
			}
			else if(so.Name().equals("Dra. Araceli de la Torre Plasencia"))
			{
				holder.btnimage.setImageResource(R.drawable.doctora);
			}
			else if(so.Name().equals("Dr. Jorge Treviño"))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else if(so.Name().equals("Dr. Hector Raul Rivero Escalante"))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else if(so.Name().equals("Dr. Juan Carlos Carrera"))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else if(so.Name().equals("Dr. Arturo Gonzalez Pool"))
			{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			else{
				holder.btnimage.setImageResource(R.drawable.doctor);
			}
			
		
		}
		

		holder.item1.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	visitas.putExtra("code", so.Code());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.item2.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	visitas.putExtra("code", so.Code());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.item3.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	visitas.putExtra("code", so.Code());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.btnimage.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	visitas.putExtra("code", so.Code());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.btntel.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				   Log.i("Edit Button Clicked", "xxxxxxxxxxxxxxxxx");
				   Intent intent = new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:" + so.telefono()));
					activity.startActivity(intent);
			   }
			  });
		
		holder.btnemail.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
				   String to = so.correo() ;
					  String subject = "";
					  String message ="";
					  Intent email = new Intent(Intent.ACTION_SEND);
					  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
					  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
					  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
					  email.putExtra(Intent.EXTRA_SUBJECT, subject);
					  email.putExtra(Intent.EXTRA_TEXT, message);

					  //need this to prompts email client only
					  email.setType("message/rfc822");

					  activity.startActivity(Intent.createChooser(email, "Seleccione un correo:"));
				  
			   }
			  });
		
		holder.btnEdit.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
				   
				   Intent map = new Intent(v.getContext(), mapActivity.class);
				   map.putExtra("code", so.Code());
				   map.putExtra("nombre", so.Name());
				   map.putExtra("coordenadasla", so.Coordenadasla());
				   map.putExtra("coordenadaslo", so.Coordenadaslo());
				   map.putExtra("direccion", so.Direccion());
		        	activity.startActivity(map);
		        	
		        	((Activity)v.getContext()).finish();
				 
				
			   }
			  });
		
		
		
		
		 
		
		return v;
	}

}