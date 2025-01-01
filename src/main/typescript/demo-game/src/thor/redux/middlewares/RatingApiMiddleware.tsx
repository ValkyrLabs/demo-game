
import { 
    getRating, 
    postRating,
    getRatingList , 
    deleteRating , 
    updateRating 
} from '../../api';

import {

    ADD_RATING_REQUEST,
    FETCH_RATING_REQUEST,
    LIST_RATING_REQUEST,
    UPDATE_RATING_REQUEST,
    DELETE_RATING_REQUEST,

    addRatingFailure,
    addRatingSuccess,

    fetchRatingFailure,
    fetchRatingSuccess,
    
    listRatingFailure,
    listRatingSuccess,

    updateRatingFailure,
    updateRatingSuccess,
    
    deleteRatingFailure,
    deleteRatingSuccess,
    
} from '../actions/RatingApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Rating
*/

export const RatingMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Rating MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_RATING_REQUEST:
            try {
                const response = postRating(action.payload);
                dispatch(addRatingSuccess(response.body));
            } catch (error) {
                dispatch(addRatingFailure(error.message));
            }
            break;

        case LIST_RATING_REQUEST:
            try {
                const response = getRatingList();
                dispatch(listRatingSuccess(response.body));
            } catch (error) {
                dispatch(listRatingFailure(error.message));
            }
            break;


        case FETCH_RATING_REQUEST:
            try {
                const response = getRating(action.id);
                dispatch(fetchRatingSuccess(response.body));
            } catch (error) {
                dispatch(fetchRatingFailure(error.message));
            }
            break;

        case UPDATE_RATING_REQUEST:
            try {
                const { id, Rating } = action.payload;
                const response = updateRating(id);
                dispatch(updateRatingSuccess(response.body));
            } catch (error) {
                dispatch(updateRatingFailure(error.message));
            }
            break;

        case DELETE_RATING_REQUEST:
            try {
                const { id, Rating } = action.payload;
                const response = deleteRating(id);
                dispatch(deleteRatingSuccess(response.body));
            } catch (error) {
                dispatch(deleteRatingFailure(error.message));
            }
            break;

        default:
            break;
    }
};

