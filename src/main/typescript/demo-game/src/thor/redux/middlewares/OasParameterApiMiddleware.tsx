
import { 
    getOasParameter, 
    postOasParameter,
    getOasParameterList , 
    deleteOasParameter , 
    updateOasParameter 
} from '../../api';

import {

    ADD_OASPARAMETER_REQUEST,
    FETCH_OASPARAMETER_REQUEST,
    LIST_OASPARAMETER_REQUEST,
    UPDATE_OASPARAMETER_REQUEST,
    DELETE_OASPARAMETER_REQUEST,

    addOasParameterFailure,
    addOasParameterSuccess,

    fetchOasParameterFailure,
    fetchOasParameterSuccess,
    
    listOasParameterFailure,
    listOasParameterSuccess,

    updateOasParameterFailure,
    updateOasParameterSuccess,
    
    deleteOasParameterFailure,
    deleteOasParameterSuccess,
    
} from '../actions/OasParameterApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasParameter
*/

export const OasParameterMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasParameter MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASPARAMETER_REQUEST:
            try {
                const response = postOasParameter(action.payload);
                dispatch(addOasParameterSuccess(response.body));
            } catch (error) {
                dispatch(addOasParameterFailure(error.message));
            }
            break;

        case LIST_OASPARAMETER_REQUEST:
            try {
                const response = getOasParameterList();
                dispatch(listOasParameterSuccess(response.body));
            } catch (error) {
                dispatch(listOasParameterFailure(error.message));
            }
            break;


        case FETCH_OASPARAMETER_REQUEST:
            try {
                const response = getOasParameter(action.id);
                dispatch(fetchOasParameterSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasParameterFailure(error.message));
            }
            break;

        case UPDATE_OASPARAMETER_REQUEST:
            try {
                const { id, OasParameter } = action.payload;
                const response = updateOasParameter(id);
                dispatch(updateOasParameterSuccess(response.body));
            } catch (error) {
                dispatch(updateOasParameterFailure(error.message));
            }
            break;

        case DELETE_OASPARAMETER_REQUEST:
            try {
                const { id, OasParameter } = action.payload;
                const response = deleteOasParameter(id);
                dispatch(deleteOasParameterSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasParameterFailure(error.message));
            }
            break;

        default:
            break;
    }
};
