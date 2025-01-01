
import { 
    getGoalDependency, 
    postGoalDependency,
    getGoalDependencyList , 
    deleteGoalDependency , 
    updateGoalDependency 
} from '../../api';

import {

    ADD_GOALDEPENDENCY_REQUEST,
    FETCH_GOALDEPENDENCY_REQUEST,
    LIST_GOALDEPENDENCY_REQUEST,
    UPDATE_GOALDEPENDENCY_REQUEST,
    DELETE_GOALDEPENDENCY_REQUEST,

    addGoalDependencyFailure,
    addGoalDependencySuccess,

    fetchGoalDependencyFailure,
    fetchGoalDependencySuccess,
    
    listGoalDependencyFailure,
    listGoalDependencySuccess,

    updateGoalDependencyFailure,
    updateGoalDependencySuccess,
    
    deleteGoalDependencyFailure,
    deleteGoalDependencySuccess,
    
} from '../actions/GoalDependencyApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: GoalDependency
*/

export const GoalDependencyMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("GoalDependency MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_GOALDEPENDENCY_REQUEST:
            try {
                const response = postGoalDependency(action.payload);
                dispatch(addGoalDependencySuccess(response.body));
            } catch (error) {
                dispatch(addGoalDependencyFailure(error.message));
            }
            break;

        case LIST_GOALDEPENDENCY_REQUEST:
            try {
                const response = getGoalDependencyList();
                dispatch(listGoalDependencySuccess(response.body));
            } catch (error) {
                dispatch(listGoalDependencyFailure(error.message));
            }
            break;


        case FETCH_GOALDEPENDENCY_REQUEST:
            try {
                const response = getGoalDependency(action.id);
                dispatch(fetchGoalDependencySuccess(response.body));
            } catch (error) {
                dispatch(fetchGoalDependencyFailure(error.message));
            }
            break;

        case UPDATE_GOALDEPENDENCY_REQUEST:
            try {
                const { id, GoalDependency } = action.payload;
                const response = updateGoalDependency(id);
                dispatch(updateGoalDependencySuccess(response.body));
            } catch (error) {
                dispatch(updateGoalDependencyFailure(error.message));
            }
            break;

        case DELETE_GOALDEPENDENCY_REQUEST:
            try {
                const { id, GoalDependency } = action.payload;
                const response = deleteGoalDependency(id);
                dispatch(deleteGoalDependencySuccess(response.body));
            } catch (error) {
                dispatch(deleteGoalDependencyFailure(error.message));
            }
            break;

        default:
            break;
    }
};

