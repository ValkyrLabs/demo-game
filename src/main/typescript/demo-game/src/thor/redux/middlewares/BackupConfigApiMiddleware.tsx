
import { 
    getBackupConfig, 
    postBackupConfig,
    getBackupConfigList , 
    deleteBackupConfig , 
    updateBackupConfig 
} from '../../api';

import {

    ADD_BACKUPCONFIG_REQUEST,
    FETCH_BACKUPCONFIG_REQUEST,
    LIST_BACKUPCONFIG_REQUEST,
    UPDATE_BACKUPCONFIG_REQUEST,
    DELETE_BACKUPCONFIG_REQUEST,

    addBackupConfigFailure,
    addBackupConfigSuccess,

    fetchBackupConfigFailure,
    fetchBackupConfigSuccess,
    
    listBackupConfigFailure,
    listBackupConfigSuccess,

    updateBackupConfigFailure,
    updateBackupConfigSuccess,
    
    deleteBackupConfigFailure,
    deleteBackupConfigSuccess,
    
} from '../actions/BackupConfigApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: BackupConfig
*/

export const BackupConfigMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("BackupConfig MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_BACKUPCONFIG_REQUEST:
            try {
                const response = postBackupConfig(action.payload);
                dispatch(addBackupConfigSuccess(response.body));
            } catch (error) {
                dispatch(addBackupConfigFailure(error.message));
            }
            break;

        case LIST_BACKUPCONFIG_REQUEST:
            try {
                const response = getBackupConfigList();
                dispatch(listBackupConfigSuccess(response.body));
            } catch (error) {
                dispatch(listBackupConfigFailure(error.message));
            }
            break;


        case FETCH_BACKUPCONFIG_REQUEST:
            try {
                const response = getBackupConfig(action.id);
                dispatch(fetchBackupConfigSuccess(response.body));
            } catch (error) {
                dispatch(fetchBackupConfigFailure(error.message));
            }
            break;

        case UPDATE_BACKUPCONFIG_REQUEST:
            try {
                const { id, BackupConfig } = action.payload;
                const response = updateBackupConfig(id);
                dispatch(updateBackupConfigSuccess(response.body));
            } catch (error) {
                dispatch(updateBackupConfigFailure(error.message));
            }
            break;

        case DELETE_BACKUPCONFIG_REQUEST:
            try {
                const { id, BackupConfig } = action.payload;
                const response = deleteBackupConfig(id);
                dispatch(deleteBackupConfigSuccess(response.body));
            } catch (error) {
                dispatch(deleteBackupConfigFailure(error.message));
            }
            break;

        default:
            break;
    }
};

