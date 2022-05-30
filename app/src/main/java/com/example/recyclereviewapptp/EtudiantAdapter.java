package com.example.recyclereviewapptp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EtudiantAdapter extends RecyclerView.Adapter <EtudiantAdapter.EtudiantViewHolder>{
    private Context context;
    private List<Etudiant> listEtudiants;

    @NonNull
    @Override
    public EtudiantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerviewitem,parent, false);
        EtudiantViewHolder etudiantViewHolder=new EtudiantViewHolder(view);
        return etudiantViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EtudiantViewHolder holder, int position) {
        Etudiant etudiant=listEtudiants.get(position);
        holder.matricule.setText(etudiant.getMatricule());
        holder.nom.setText(etudiant.getNom());



    }

    @Override
    public int getItemCount() {
        return listEtudiants.size();
    }

    public static class EtudiantViewHolder extends RecyclerView.ViewHolder{
        TextView matricule;
        TextView nom;

        public EtudiantViewHolder(@NonNull View itemView) {
            super(itemView);
            matricule=itemView.findViewById(R.id.matricule);
            nom=itemView.findViewById(R.id.nom);
        }
    }
}
