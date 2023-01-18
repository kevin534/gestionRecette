package org.recette.dao;

import org.recette.pojos.Ingredient;
import org.recette.pojos.Recette;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecetteDAO {

    private Connection connection;

    public RecetteDAO(Connection connection){
        this.connection = connection;
    }
    public Recette createRecette(Recette recette)throws SQLException {
        String query = "insert into recette(titre,autheur,note,dateCreation) " +
                "values(?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,recette.getTitre());
        preparedStatement.setString(2, recette.getAutheur());
        preparedStatement.setInt(3, recette.getNote());
        preparedStatement.setDate(4, (Date) recette.getDateCreation());
        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if(resultSet.next()){
            recette.setIdRecette(resultSet.getInt(1));
        }

        return  recette;
    }

    public Recette getRecette(int idRecette)throws SQLException{
        Recette recette = null;
        String query = "select * from recette where idRecette = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idRecette);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            recette = new Recette();
            recette.setIdRecette(resultSet.getInt("idRecette"));
            recette.setTitre(resultSet.getString("titre"));
            recette.setAutheur(resultSet.getString("autheur"));
            recette.setNote(resultSet.getInt("note"));
            recette.setDateCreation(resultSet.getDate("dateCreation"));

        }
        return recette;
    }


    public Recette getRecette(String titre)throws SQLException{
        Recette recette = null;
        String query = "select * from recette where titre = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,titre);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            recette = new Recette();
            recette.setIdRecette(resultSet.getInt("idRecette"));
            recette.setTitre(resultSet.getString("titre"));
            recette.setAutheur(resultSet.getString("autheur"));
            recette.setNote(resultSet.getInt("note"));
            recette.setDateCreation(resultSet.getDate("dateCreation"));

        }
        return recette;
    }

    public List<Recette> getAll()throws SQLException{
        List<Recette> recettes = new ArrayList<>();
        String query = "select * from recette";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            Recette  recette = new Recette();
            recette.setIdRecette(resultSet.getInt("idRecette"));
            recette.setTitre(resultSet.getString("titre"));
            recette.setAutheur(resultSet.getString("autheur"));
            recette.setNote(resultSet.getInt("note"));
            recette.setDateCreation(resultSet.getDate("dateCreation"));

            recettes.add(recette);
        }

        return  recettes;
    }

    public int updateRecette(Recette recette)throws SQLException{
        int status = 0;
        String query = " update recette set " +
                "titre = ?, " +
                "autheur = ?, " +
                "note = ?, " +
                "dateCreation = ? " +
                "where idRecette = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,recette.getTitre());
        preparedStatement.setString(2, recette.getAutheur());
        preparedStatement.setInt(3, recette.getNote());
        preparedStatement.setDate(4, (Date) recette.getDateCreation());
        preparedStatement.setInt(5,recette.getIdRecette());

        status = preparedStatement.executeUpdate();

        return  status;
    }


    public int deleteRecette(int idRecette )throws  SQLException{
        int status = 0;
        String query = "delete from ingredient where idIngredient = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idRecette);
        status = preparedStatement.executeUpdate();

        return status;
    }

}
