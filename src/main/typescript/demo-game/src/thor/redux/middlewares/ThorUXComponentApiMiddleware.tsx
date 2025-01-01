
import { 
    getThorUXComponent, 
    postThorUXComponent,
    getThorUXComponentList , 
    deleteThorUXComponent , 
    updateThorUXComponent 
} from '../../api';

import {

    ADD_THORUXCOMPONENT_REQUEST,
    FETCH_THORUXCOMPONENT_REQUEST,
    LIST_THORUXCOMPONENT_REQUEST,
    UPDATE_THORUXCOMPONENT_REQUEST,
    DELETE_THORUXCOMPONENT_REQUEST,

    addThorUXComponentFailure,
    addThorUXComponentSuccess,

    fetchThorUXComponentFailure,
    fetchThorUXComponentSuccess,
    
    listThorUXComponentFailure,
    listThorUXComponentSuccess,

    updateThorUXComponentFailure,
    updateThorUXComponentSuccess,
    
    deleteThorUXComponentFailure,
    deleteThorUXComponentSuccess,
    
} from '../actions/ThorUXComponentApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ThorUXComponent
*/

export const ThorUXComponentMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("ThorUXComponent MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_THORUXCOMPONENT_REQUEST:
            try {
                const response = postThorUXComponent(action.payload);
                dispatch(addThorUXComponentSuccess(response.body));
            } catch (error) {
                dispatch(addThorUXComponentFailure(error.message));
            }
            break;

        case LIST_THORUXCOMPONENT_REQUEST:
            try {
                const response = getThorUXComponentList();
                dispatch(listThorUXComponentSuccess(response.body));
            } catch (error) {
                dispatch(listThorUXComponentFailure(error.message));
            }
            break;


        case FETCH_THORUXCOMPONENT_REQUEST:
            try {
                const response = getThorUXComponent(action.id);
                dispatch(fetchThorUXComponentSuccess(response.body));
            } catch (error) {
                dispatch(fetchThorUXComponentFailure(error.message));
            }
            break;

        case UPDATE_THORUXCOMPONENT_REQUEST:
            try {
                const { id, ThorUXComponent } = action.payload;
                const response = updateThorUXComponent(id);
                dispatch(updateThorUXComponentSuccess(response.body));
            } catch (error) {
                dispatch(updateThorUXComponentFailure(error.message));
            }
            break;

        case DELETE_THORUXCOMPONENT_REQUEST:
            try {
                const { id, ThorUXComponent } = action.payload;
                const response = deleteThorUXComponent(id);
                dispatch(deleteThorUXComponentSuccess(response.body));
            } catch (error) {
                dispatch(deleteThorUXComponentFailure(error.message));
            }
            break;

        default:
            break;
    }
};
