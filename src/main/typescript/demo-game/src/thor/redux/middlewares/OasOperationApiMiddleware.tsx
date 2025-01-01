
import { 
    getOasOperation, 
    postOasOperation,
    getOasOperationList , 
    deleteOasOperation , 
    updateOasOperation 
} from '../../api';

import {

    ADD_OASOPERATION_REQUEST,
    FETCH_OASOPERATION_REQUEST,
    LIST_OASOPERATION_REQUEST,
    UPDATE_OASOPERATION_REQUEST,
    DELETE_OASOPERATION_REQUEST,

    addOasOperationFailure,
    addOasOperationSuccess,

    fetchOasOperationFailure,
    fetchOasOperationSuccess,
    
    listOasOperationFailure,
    listOasOperationSuccess,

    updateOasOperationFailure,
    updateOasOperationSuccess,
    
    deleteOasOperationFailure,
    deleteOasOperationSuccess,
    
} from '../actions/OasOperationApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasOperation
*/

export const OasOperationMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasOperation MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASOPERATION_REQUEST:
            try {
                const response = postOasOperation(action.payload);
                dispatch(addOasOperationSuccess(response.body));
            } catch (error) {
                dispatch(addOasOperationFailure(error.message));
            }
            break;

        case LIST_OASOPERATION_REQUEST:
            try {
                const response = getOasOperationList();
                dispatch(listOasOperationSuccess(response.body));
            } catch (error) {
                dispatch(listOasOperationFailure(error.message));
            }
            break;


        case FETCH_OASOPERATION_REQUEST:
            try {
                const response = getOasOperation(action.id);
                dispatch(fetchOasOperationSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasOperationFailure(error.message));
            }
            break;

        case UPDATE_OASOPERATION_REQUEST:
            try {
                const { id, OasOperation } = action.payload;
                const response = updateOasOperation(id);
                dispatch(updateOasOperationSuccess(response.body));
            } catch (error) {
                dispatch(updateOasOperationFailure(error.message));
            }
            break;

        case DELETE_OASOPERATION_REQUEST:
            try {
                const { id, OasOperation } = action.payload;
                const response = deleteOasOperation(id);
                dispatch(deleteOasOperationSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasOperationFailure(error.message));
            }
            break;

        default:
            break;
    }
};

