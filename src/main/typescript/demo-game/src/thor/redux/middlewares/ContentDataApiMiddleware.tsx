
import { 
    getContentData, 
    postContentData,
    getContentDataList , 
    deleteContentData , 
    updateContentData 
} from '../../api';

import {

    ADD_CONTENTDATA_REQUEST,
    FETCH_CONTENTDATA_REQUEST,
    LIST_CONTENTDATA_REQUEST,
    UPDATE_CONTENTDATA_REQUEST,
    DELETE_CONTENTDATA_REQUEST,

    addContentDataFailure,
    addContentDataSuccess,

    fetchContentDataFailure,
    fetchContentDataSuccess,
    
    listContentDataFailure,
    listContentDataSuccess,

    updateContentDataFailure,
    updateContentDataSuccess,
    
    deleteContentDataFailure,
    deleteContentDataSuccess,
    
} from '../actions/ContentDataApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ContentData
*/

export const ContentDataMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("ContentData MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_CONTENTDATA_REQUEST:
            try {
                const response = postContentData(action.payload);
                dispatch(addContentDataSuccess(response.body));
            } catch (error) {
                dispatch(addContentDataFailure(error.message));
            }
            break;

        case LIST_CONTENTDATA_REQUEST:
            try {
                const response = getContentDataList();
                dispatch(listContentDataSuccess(response.body));
            } catch (error) {
                dispatch(listContentDataFailure(error.message));
            }
            break;


        case FETCH_CONTENTDATA_REQUEST:
            try {
                const response = getContentData(action.id);
                dispatch(fetchContentDataSuccess(response.body));
            } catch (error) {
                dispatch(fetchContentDataFailure(error.message));
            }
            break;

        case UPDATE_CONTENTDATA_REQUEST:
            try {
                const { id, ContentData } = action.payload;
                const response = updateContentData(id);
                dispatch(updateContentDataSuccess(response.body));
            } catch (error) {
                dispatch(updateContentDataFailure(error.message));
            }
            break;

        case DELETE_CONTENTDATA_REQUEST:
            try {
                const { id, ContentData } = action.payload;
                const response = deleteContentData(id);
                dispatch(deleteContentDataSuccess(response.body));
            } catch (error) {
                dispatch(deleteContentDataFailure(error.message));
            }
            break;

        default:
            break;
    }
};

