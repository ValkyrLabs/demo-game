
import { 
    getOasPath, 
    postOasPath,
    getOasPathList , 
    deleteOasPath , 
    updateOasPath 
} from '../../api';

import {

    ADD_OASPATH_REQUEST,
    FETCH_OASPATH_REQUEST,
    LIST_OASPATH_REQUEST,
    UPDATE_OASPATH_REQUEST,
    DELETE_OASPATH_REQUEST,

    addOasPathFailure,
    addOasPathSuccess,

    fetchOasPathFailure,
    fetchOasPathSuccess,
    
    listOasPathFailure,
    listOasPathSuccess,

    updateOasPathFailure,
    updateOasPathSuccess,
    
    deleteOasPathFailure,
    deleteOasPathSuccess,
    
} from '../actions/OasPathApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasPath
*/

export const OasPathMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasPath MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASPATH_REQUEST:
            try {
                const response = postOasPath(action.payload);
                dispatch(addOasPathSuccess(response.body));
            } catch (error) {
                dispatch(addOasPathFailure(error.message));
            }
            break;

        case LIST_OASPATH_REQUEST:
            try {
                const response = getOasPathList();
                dispatch(listOasPathSuccess(response.body));
            } catch (error) {
                dispatch(listOasPathFailure(error.message));
            }
            break;


        case FETCH_OASPATH_REQUEST:
            try {
                const response = getOasPath(action.id);
                dispatch(fetchOasPathSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasPathFailure(error.message));
            }
            break;

        case UPDATE_OASPATH_REQUEST:
            try {
                const { id, OasPath } = action.payload;
                const response = updateOasPath(id);
                dispatch(updateOasPathSuccess(response.body));
            } catch (error) {
                dispatch(updateOasPathFailure(error.message));
            }
            break;

        case DELETE_OASPATH_REQUEST:
            try {
                const { id, OasPath } = action.payload;
                const response = deleteOasPath(id);
                dispatch(deleteOasPathSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasPathFailure(error.message));
            }
            break;

        default:
            break;
    }
};

