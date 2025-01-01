
import { 
    getSolution, 
    postSolution,
    getSolutionList , 
    deleteSolution , 
    updateSolution 
} from '../../api';

import {

    ADD_SOLUTION_REQUEST,
    FETCH_SOLUTION_REQUEST,
    LIST_SOLUTION_REQUEST,
    UPDATE_SOLUTION_REQUEST,
    DELETE_SOLUTION_REQUEST,

    addSolutionFailure,
    addSolutionSuccess,

    fetchSolutionFailure,
    fetchSolutionSuccess,
    
    listSolutionFailure,
    listSolutionSuccess,

    updateSolutionFailure,
    updateSolutionSuccess,
    
    deleteSolutionFailure,
    deleteSolutionSuccess,
    
} from '../actions/SolutionApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Solution
*/

export const SolutionMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Solution MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_SOLUTION_REQUEST:
            try {
                const response = postSolution(action.payload);
                dispatch(addSolutionSuccess(response.body));
            } catch (error) {
                dispatch(addSolutionFailure(error.message));
            }
            break;

        case LIST_SOLUTION_REQUEST:
            try {
                const response = getSolutionList();
                dispatch(listSolutionSuccess(response.body));
            } catch (error) {
                dispatch(listSolutionFailure(error.message));
            }
            break;


        case FETCH_SOLUTION_REQUEST:
            try {
                const response = getSolution(action.id);
                dispatch(fetchSolutionSuccess(response.body));
            } catch (error) {
                dispatch(fetchSolutionFailure(error.message));
            }
            break;

        case UPDATE_SOLUTION_REQUEST:
            try {
                const { id, Solution } = action.payload;
                const response = updateSolution(id);
                dispatch(updateSolutionSuccess(response.body));
            } catch (error) {
                dispatch(updateSolutionFailure(error.message));
            }
            break;

        case DELETE_SOLUTION_REQUEST:
            try {
                const { id, Solution } = action.payload;
                const response = deleteSolution(id);
                dispatch(deleteSolutionSuccess(response.body));
            } catch (error) {
                dispatch(deleteSolutionFailure(error.message));
            }
            break;

        default:
            break;
    }
};
