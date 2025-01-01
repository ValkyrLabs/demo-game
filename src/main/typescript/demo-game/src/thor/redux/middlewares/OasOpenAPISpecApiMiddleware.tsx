
import { 
    getOasOpenAPISpec, 
    postOasOpenAPISpec,
    getOasOpenAPISpecList , 
    deleteOasOpenAPISpec , 
    updateOasOpenAPISpec 
} from '../../api';

import {

    ADD_OASOPENAPISPEC_REQUEST,
    FETCH_OASOPENAPISPEC_REQUEST,
    LIST_OASOPENAPISPEC_REQUEST,
    UPDATE_OASOPENAPISPEC_REQUEST,
    DELETE_OASOPENAPISPEC_REQUEST,

    addOasOpenAPISpecFailure,
    addOasOpenAPISpecSuccess,

    fetchOasOpenAPISpecFailure,
    fetchOasOpenAPISpecSuccess,
    
    listOasOpenAPISpecFailure,
    listOasOpenAPISpecSuccess,

    updateOasOpenAPISpecFailure,
    updateOasOpenAPISpecSuccess,
    
    deleteOasOpenAPISpecFailure,
    deleteOasOpenAPISpecSuccess,
    
} from '../actions/OasOpenAPISpecApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasOpenAPISpec
*/

export const OasOpenAPISpecMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasOpenAPISpec MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASOPENAPISPEC_REQUEST:
            try {
                const response = postOasOpenAPISpec(action.payload);
                dispatch(addOasOpenAPISpecSuccess(response.body));
            } catch (error) {
                dispatch(addOasOpenAPISpecFailure(error.message));
            }
            break;

        case LIST_OASOPENAPISPEC_REQUEST:
            try {
                const response = getOasOpenAPISpecList();
                dispatch(listOasOpenAPISpecSuccess(response.body));
            } catch (error) {
                dispatch(listOasOpenAPISpecFailure(error.message));
            }
            break;


        case FETCH_OASOPENAPISPEC_REQUEST:
            try {
                const response = getOasOpenAPISpec(action.id);
                dispatch(fetchOasOpenAPISpecSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasOpenAPISpecFailure(error.message));
            }
            break;

        case UPDATE_OASOPENAPISPEC_REQUEST:
            try {
                const { id, OasOpenAPISpec } = action.payload;
                const response = updateOasOpenAPISpec(id);
                dispatch(updateOasOpenAPISpecSuccess(response.body));
            } catch (error) {
                dispatch(updateOasOpenAPISpecFailure(error.message));
            }
            break;

        case DELETE_OASOPENAPISPEC_REQUEST:
            try {
                const { id, OasOpenAPISpec } = action.payload;
                const response = deleteOasOpenAPISpec(id);
                dispatch(deleteOasOpenAPISpecSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasOpenAPISpecFailure(error.message));
            }
            break;

        default:
            break;
    }
};
