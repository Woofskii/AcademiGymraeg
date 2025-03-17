/**
 * 
 */
package uk.ac.bangor.cs.cambria.AcademiGymraeg.Enum;

/**
 * This enum is used to classify the type of a question, either English to Welsh, Welsh to English, or Gender.
 * In the database, this classification will be represented by a tinyint column, in the Question table.
 */

public enum QuestionType {
    ENGLISH_TO_WELSH,
    WELSH_TO_ENGLISH,
    GENDER
}
