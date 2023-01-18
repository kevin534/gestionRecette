package org.recette.dao;

import org.recette.pojos.Ingredient;
import org.recette.pojos.Recette;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IngredientDAO {
    private Connection connection;

    public IngredientDAO(Connection connection){
        this.connection = connection;
    }
    public Ingredient createIngredient(Ingredient ingredient)throws SQLException {
        String query = "insert into ingredient(idRecette,nom,quantite,unit) " +
                "values(?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1,ingredient.getIdRecette());
        preparedStatement.setString(2, ingredient.getNom());
        preparedStatement.setInt(3, ingredient.getQuantite());
        preparedStatement.setString(4, ingredient.getUnit());
        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if(resultSet.next()){
            ingredient.setIdIngredient(resultSet.getInt(1));
        }

        return  ingredient;
    }
    public Ingredient getIngredient(int idIngredient)throws SQLException{
        Ingredient ingredient = null;
        String query = "select * from ingredient where idIngredient = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idIngredient);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            ingredient = new Ingredient();
            ingredient.setIdIngredient(resultSet.getInt("idIngredient"));
            ingredient.setIdRecette(resultSet.getInt("idRecette"));
            ingredient.setNom(resultSet.getString("nom"));
            ingredient.setQuantite(resultSet.getInt("quantite"));
            ingredient.setUnit(resultSet.getString("unit"));

        }
        return ingredient;
    }




    public Ingredient getIngredient(String nom)throws SQLException{
        Ingredient ingredient = null;
        String query = "select * from ingredient where nom = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,nom);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            ingredient = new Ingredient();
            ingredient.setIdIngredient(resultSet.getInt("idIngredient"));
            ingredient.setIdRecette(resultSet.getInt("idRecette"));
            ingredient.setNom(resultSet.getString("nom"));
            ingredient.setQuantite(resultSet.getInt("quantite"));
            ingredient.setUnit(resultSet.getString("unit"));

        }
        return ingredient;
    }

    public int updateIngredient(Ingredient ingredient)throws SQLException{
        int status = 0;
        String query = " update ingredient set " +
                "idRecette = ?, " +
                "nom = ?, " +
                "quantite = ?, " +
                "unit = ? " +
                "where idIngredient = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1,ingredient.getIdRecette());
        preparedStatement.setString(2, ingredient.getNom());
        preparedStatement.setInt(3, ingredient.getQuantite());
        preparedStatement.setString(4, ingredient.getUnit());
        preparedStatement.setInt(5,ingredient.getIdIngredient());

        status = preparedStatement.executeUpdate();

        return  status;
    }

    public List<Ingredient> getAll()throws SQLException{
        List<Ingredient> ingredients = new ArrayList<>();
        String query = "select * from ingredient";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            Ingredient  ingredient = new Ingredient();
            ingredient.setIdIngredient(resultSet.getInt("idIngredient"));
            ingredient.setIdRecette(resultSet.getInt("idRecette"));
            ingredient.setNom(resultSet.getString("nom"));
            ingredient.setQuantite(resultSet.getInt("quantite"));
            ingredient.setUnit(resultSet.getString("unit"));

            ingredients.add(ingredient);
        }

        return  ingredients;
    }

    public int deleteIngredient(int idIngredient )throws  SQLException{
        int status = 0;
        String query = "delete from ingredient where idIngredient = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idIngredient);
        status = preparedStatement.executeUpdate();

        return status;
    }


}
