
import { 
    getOasComponents, 
    postOasComponents,
    getOasComponentsList , 
    deleteOasComponents , 
    updateOasComponents 
} from '../../api';

import {

    ADD_OASCOMPONENTS_REQUEST,
    FETCH_OASCOMPONENTS_REQUEST,
    LIST_OASCOMPONENTS_REQUEST,
    UPDATE_OASCOMPONENTS_REQUEST,
    DELETE_OASCOMPONENTS_REQUEST,

    addOasComponentsFailure,
    addOasComponentsSuccess,

    fetchOasComponentsFailure,
    fetchOasComponentsSuccess,
    
    listOasComponentsFailure,
    listOasComponentsSuccess,

    updateOasComponentsFailure,
    updateOasComponentsSuccess,
    
    deleteOasComponentsFailure,
    deleteOasComponentsSuccess,
    
} from '../actions/OasComponentsApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasComponents
*/

export const OasComponentsMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasComponents MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASCOMPONENTS_REQUEST:
            try {
                const response = postOasComponents(action.payload);
                dispatch(addOasComponentsSuccess(response.body));
            } catch (error) {
                dispatch(addOasComponentsFailure(error.message));
            }
            break;

        case LIST_OASCOMPONENTS_REQUEST:
            try {
                const response = getOasComponentsList();
                dispatch(listOasComponentsSuccess(response.body));
            } catch (error) {
                dispatch(listOasComponentsFailure(error.message));
            }
            break;


        case FETCH_OASCOMPONENTS_REQUEST:
            try {
                const response = getOasComponents(action.id);
                dispatch(fetchOasComponentsSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasComponentsFailure(error.message));
            }
            break;

        case UPDATE_OASCOMPONENTS_REQUEST:
            try {
                const { id, OasComponents } = action.payload;
                const response = updateOasComponents(id);
                dispatch(updateOasComponentsSuccess(response.body));
            } catch (error) {
                dispatch(updateOasComponentsFailure(error.message));
            }
            break;

        case DELETE_OASCOMPONENTS_REQUEST:
            try {
                const { id, OasComponents } = action.payload;
                const response = deleteOasComponents(id);
                dispatch(deleteOasComponentsSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasComponentsFailure(error.message));
            }
            break;

        default:
            break;
    }
};
