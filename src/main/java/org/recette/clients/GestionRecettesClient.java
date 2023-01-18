package org.recette.clients;

import org.recette.dao.IngredientDAO;
import org.recette.dao.RecetteDAO;
import org.recette.pojos.Ingredient;
import org.recette.pojos.Recette;
import org.recette.utils.DataConnect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestionRecettesClient {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DataConnect.getConnection();
            System.out.println("----------------- TEST CONNECTION-------------\n");
            System.out.println("Connection : "+connection);
            RecetteDAO recetteDAO = new RecetteDAO(connection);
            IngredientDAO ingredientDAO =  new IngredientDAO(connection);


            Date date1 = java.sql.Date.valueOf("2023-01-05");
            // Créer les 2 recettes : « Tartiflette » et « Velouté de carottes au cumin »
           // TODO: Créer une Recette
            Recette recette = new Recette("Velouté de carottes au cumin","Kevin",2,date1);
            Recette recetteCreated = recetteDAO.createRecette(recette);
           System.out.println("TEST CREATION RECETTE");
            System.out.println(recetteCreated);

            // TODO: Créer une Ingredient
            Ingredient ingredient = new Ingredient(2,"Pommes de terre",750,"g");
            Ingredient ingredientCreated = ingredientDAO.createIngredient(ingredient);
            System.out.println("TEST CREATION INGREDIENT 1 pour la recette Tartiflette");
            System.out.println(ingredientCreated);

            // TODO: Créer une Ingredient
            Ingredient ingredient1 = new Ingredient(2,"Reblochon",1,"u");
            Ingredient ingredientCreated1 = ingredientDAO.createIngredient(ingredient1);
            System.out.println("TEST CREATION INGREDIENT 2 pour la recette Tartiflette");
            System.out.println(ingredientCreated1);
            // TODO: Créer une Ingredient
            Ingredient ingredient2 = new Ingredient(2,"Lardons",200,"g");
            Ingredient ingredientCreated2 = ingredientDAO.createIngredient(ingredient2);
            System.out.println("TEST CREATION INGREDIENT 3 pour la recette Tartiflette");
            System.out.println(ingredientCreated2);

            // TODO: Créer une Ingredient
            Ingredient ingredient3 = new Ingredient(2,"Crème fraiche épaisse",3,"cs");
            Ingredient ingredientCreated3 = ingredientDAO.createIngredient(ingredient3);
            System.out.println("TEST CREATION INGREDIENT 4 pour la recette Tartiflette");
            System.out.println(ingredientCreated3);

            // TODO: Créer une Ingredient
            Ingredient ingredient4 = new Ingredient(2,"Oignons",2,"u");
            Ingredient ingredientCreated4 = ingredientDAO.createIngredient(ingredient4);
            System.out.println("TEST CREATION INGREDIENT 4 pour la recette Tartiflette");
            System.out.println(ingredientCreated4);

            // TODO: Créer une Ingredient
            Ingredient ingredient5 = new Ingredient(2,"Beurre",20,"g");
            Ingredient ingredientCreated5 = ingredientDAO.createIngredient(ingredient5);
            System.out.println("TEST CREATION INGREDIENT 5 pour la recette Tartiflette");
            System.out.println(ingredientCreated5);

            // TODO: Créer une Ingredient
            Ingredient ingredient6 = new Ingredient(2,"Sel",1,"cc");
            Ingredient ingredientCreated6 = ingredientDAO.createIngredient(ingredient6);
            System.out.println("TEST CREATION INGREDIENT 6 pour la recette Tartiflette");
            System.out.println(ingredientCreated6);

            // TODO: Créer une Ingredient
            Ingredient ingredient7 = new Ingredient(2,"Poivre",1,"p");
            Ingredient ingredientCreated7 = ingredientDAO.createIngredient(ingredient7);
            System.out.println("TEST CREATION INGREDIENT 7");
            System.out.println(ingredientCreated7);

            // TODO: Créer une Ingredient
            Ingredient ingredient01 = new Ingredient(3,"Carottes",800,"g");
            Ingredient ingredientCreated01 = ingredientDAO.createIngredient(ingredient01);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated01);

            // TODO: Créer une Ingredient
            Ingredient ingredient02 = new Ingredient(3,"Oignons",1,"u");
            Ingredient ingredientCreated02 = ingredientDAO.createIngredient(ingredient02);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated02);

            // TODO: Créer une Ingredient
            Ingredient ingredient03 = new Ingredient(3,"Bouillon de volaille",1,"l");
            Ingredient ingredientCreated03 = ingredientDAO.createIngredient(ingredient03);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated03);

            // TODO: Créer une Ingredient
            Ingredient ingredient04 = new Ingredient(3,"Cumin de volaille",1,"cs");
            Ingredient ingredientCreated04 = ingredientDAO.createIngredient(ingredient04);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated04);

            // TODO: Créer une Ingredient
            Ingredient ingredient05 = new Ingredient(3,"Creme fraiche épaisse",2,"cs");
            Ingredient ingredientCreated05 = ingredientDAO.createIngredient(ingredient05);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated05);

            // TODO: Créer une Ingredient
            Ingredient ingredient06 = new Ingredient(3,"Huille d'olive",2,"cs");
            Ingredient ingredientCreated06 = ingredientDAO.createIngredient(ingredient06);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated06);

            // TODO: Créer une Ingredient
            Ingredient ingredient07 = new Ingredient(3,"Sel",1,"cc");
            Ingredient ingredientCreated07 = ingredientDAO.createIngredient(ingredient07);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated07);

            // TODO: Créer une Ingredient
            Ingredient ingredient08 = new Ingredient(3,"Poivre",1,"p");
            Ingredient ingredientCreated08 = ingredientDAO.createIngredient(ingredient08);
            System.out.println("TEST CREATION INGREDIENT pour la recette Velouté de carotte");
            System.out.println(ingredientCreated08);

            //TODO: GET INGREDIENT BY ID INGREDIENT
            Ingredient ingredientA = ingredientDAO.getIngredient(1);
            System.out.println("TEST GET INGREDIENT BY ID INGREDIENT");
            System.out.println(ingredientA);

            //TODO: GET RECETTE BY ID IDRECETTE
            Recette recettea = recetteDAO.getRecette(2);
            System.out.println("TEST GET RECETTE BY ID IDRECETTE");
            System.out.println(recettea);

            //TODO: GET INGREDIENT BY ID NOM = Huille d'olive
            Ingredient ingredientHuileOlive = ingredientDAO.getIngredient("Huille d'olive");
            System.out.println("TEST GET INGREDIENT BY  NOM");
            System.out.println(ingredientHuileOlive);
            int idIngredientHuileOlive = ingredientHuileOlive.getIdIngredient();

            //TODO: UPDATE INGREDIENT PAR NOM = Huille d'olive avec BEURE ET QUANTITE
            System.out.println("TEST UPDATE INGREDIENT");
            ingredient = ingredientDAO.getIngredient(idIngredientHuileOlive);
            ingredient.setNom("Beure");
            ingredient.setQuantite(20);
            ingredientDAO.updateIngredient(ingredient);
            ingredient = ingredientDAO.getIngredient(idIngredientHuileOlive);
            System.out.println(ingredient);

            //TODO: GET ALL INGREDIENT
            System.out.println("TEST GET ALL INGREDIENT ");
            List<Ingredient> ingredientsList = ingredientDAO.getAll();
            for (Ingredient item:  ingredientsList
            ) {
                System.out.println(item);
            }

            //TODO: GET ALL RECETTE
            System.out.println("TEST GET ALL RECETTE ");
            List<Recette> recettes = recetteDAO.getAll();
            for (Recette item:  recettes
            ) {
                System.out.println(item);
            }

            //TODO: GET ALL INGREDIENT POUR LA RECETTE TARTIFLETTE
            System.out.println("TEST GET ALL INGREDIENT POUR LA RECETTE TARTIFLETTE ");
            List<Ingredient> result = new ArrayList<>();
            List<Recette> recettess = recetteDAO.getAll();
            for (Recette item:  recettess
            ) {
                if(item.getTitre().equals("Tartiflette")){
                    int recette_ = item.getIdRecette();
                    System.out.println("Liste DES INGREDIENTS DE LA RECETTE : " +item.getTitre());
                    List<Ingredient> ingredientsLists = ingredientDAO.getAll()
                            .stream()
                            .filter(str -> str.getIdRecette() == recette_)
                            .toList();
                    for (Ingredient ing:  ingredientsLists
                    ) {
                        System.out.println(ing);
                    }
                }
            }

            Ingredient ingredientcu = ingredientDAO.getIngredient("Cumin");
            int idIngredientToDelete = ingredientcu.getIdIngredient();

            //TODO: DELETE INGREDIENT BY NOM
            System.out.println("TEST DELETE INGREDIENT NOM = CUMIN DE VOLAILLE");
            ingredientDAO.deleteIngredient(idIngredientToDelete);
            Ingredient ingredientds = ingredientDAO.getIngredient(idIngredientToDelete);
            System.out.println(ingredientds);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    connection.close();

                } catch (SQLException e) {
                    e.printStackTrace();


                }
            }
        }


    }
}
