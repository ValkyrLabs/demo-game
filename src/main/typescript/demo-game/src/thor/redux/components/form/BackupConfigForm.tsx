import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { BackupConfig, BackupConfigTypeEnum, BackupConfigPriorityLevelEnum,  } from '../../../model';
import { useAddBackupConfigMutation } from '../../services/BackupConfigService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: BackupConfig
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const TypeValidation = () => { 
  return(
    [
      'workstation', 'server', 'desktop', 'laptop', 'device', 
    ]
  )
};

const PriorityLevelValidation = () => { 
  return(
    [
      'low', 'medium', 'high', 'critical', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     name: Yup.string()
    
    
    
    
    ,
     description: Yup.string()
    
    
    
    
    ,
     remoteConfigUrl: Yup.string()
    
    
    
    
    ,
     runNumber: Yup.number()
    
    
    
    
    ,
     percentComplete: Yup.number()
    
    
    
    
    ,
     type: Yup.string().oneOf(TypeValidation(), 'Invalid value selected for type')
    
    
    
    
    ,
     priorityLevel: Yup.string().oneOf(PriorityLevelValidation(), 'Invalid value selected for priorityLevel')
    
    
    
    
    ,
     backupDir: Yup.string()
    
    
    
    
    ,
     workingDir: Yup.string()
    
    
    
    
    ,
     skiplist: Yup.string()
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const BackupConfigForm: React.FC = () => {
  const [addBackupConfig, addBackupConfigResult] = useAddBackupConfigMutation();

  const initialValues: BackupConfig = {
    
    
    name : 'null',
    
    
    
    
    
    
    
    description : 'null',
    
    
    
    
    
    
    
    remoteConfigUrl : 'null',
    
    
    
    
    
    
    
    
    
    runNumber : 0, 
    
    
    
    
    
    
    
    percentComplete : 0, 
    
    
    
        type :   BackupConfigTypeEnum[Object.keys(BackupConfigTypeEnum)[0]], 
        priorityLevel :   BackupConfigPriorityLevelEnum[Object.keys(BackupConfigPriorityLevelEnum)[0]], 
    
    
    backupDir : '/users/jax/project-one',
    
    
    
    
    
    
    
    workingDir : '/users/jax/project-one',
    
    
    
    
    
    
    
    skiplist : 'node_modules, etc.',
    
    
    
    
    
    
    
    id : '0841c84f-1443-4249-ad63-ee805d0b1b67',
    
    
    
    
    
    
    
    ownerId : 'ed8f40c4-4e19-4946-a59e-b33e2066ff62',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'a3e243bc-55f9-4680-b92d-6e8ca17acb5e',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : 'f93c9fcb-b1c0-4eb2-b052-6a1f1e9261c9',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<BackupConfig>) => {
    setTimeout(() => {
      console.log(values);
      addBackupConfig(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addBackupConfigResult: {JSON.stringify(addBackupConfigResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New BackupConfig</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="name" className="nice-form-control">
              <b>Name: {touched.name && !errors.name && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* name  TEXT FIELD */}
              <Field name="name" type="text"
                className={errors.name  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="name" component="span" />
            </label>


        
            <label htmlFor="description" className="nice-form-control">
              <b>Description: {touched.description && !errors.description && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* description  TEXT FIELD */}
              <Field name="description" type="text"
                className={errors.description  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="description" component="span" />
            </label>


        
            <label htmlFor="remoteConfigUrl" className="nice-form-control">
              <b>Remote Config Url: {touched.remoteConfigUrl && !errors.remoteConfigUrl && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* remoteConfigUrl  TEXT FIELD */}
              <Field name="remoteConfigUrl" type="text"
                className={errors.remoteConfigUrl  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="remoteConfigUrl" component="span" />
            </label>


        
            <label htmlFor="runNumber" className="nice-form-control">
              <b>Run Number: {touched.runNumber && !errors.runNumber && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*runNumber INTEGER FIELD */}
              <Field name="runNumber" type="text"
                className={errors.runNumber  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="runNumber" component="span" />
            </label>


        
            <label htmlFor="percentComplete" className="nice-form-control">
              <b>Percent Complete: {touched.percentComplete && !errors.percentComplete && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*percentComplete INTEGER FIELD */}
              <Field name="percentComplete" type="text"
                className={errors.percentComplete  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="percentComplete" component="span" />
            </label>


        
            <label htmlFor="type" className="nice-form-control">
              <b>Type: {touched.type && !errors.type && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="type"
                className={errors.type ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('type', true);
                  setFieldValue('type', e.target.value);
                }}
              >
                <option value="" label="Select Type" />
                <TypeLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="type" component="span" />
            </label>


        
            <label htmlFor="priorityLevel" className="nice-form-control">
              <b>Priority Level: {touched.priorityLevel && !errors.priorityLevel && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="priorityLevel"
                className={errors.priorityLevel ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('priorityLevel', true);
                  setFieldValue('priorityLevel', e.target.value);
                }}
              >
                <option value="" label="Select Priority Level" />
                <PriorityLevelLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="priorityLevel" component="span" />
            </label>


        
            <label htmlFor="backupDir" className="nice-form-control">
              <b>Backup Dir: {touched.backupDir && !errors.backupDir && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* backupDir  TEXT FIELD */}
              <Field name="backupDir" type="text"
                className={errors.backupDir  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="backupDir" component="span" />
            </label>


        
            <label htmlFor="workingDir" className="nice-form-control">
              <b>Working Dir: {touched.workingDir && !errors.workingDir && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* workingDir  TEXT FIELD */}
              <Field name="workingDir" type="text"
                className={errors.workingDir  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="workingDir" component="span" />
            </label>


        
            <label htmlFor="skiplist" className="nice-form-control">
              <b>Skiplist: {touched.skiplist && !errors.skiplist && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* skiplist  TEXT FIELD */}
              <Field name="skiplist" type="text"
                className={errors.skiplist  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="skiplist" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New BackupConfig
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase typelookup
uppercase TYPELOOKUP
snakecase type_lookup
pascalcase TypeLookup
camelcase typeLookup
kebabcase type-lookup


*/

const TypeLookup = () => { 
  return(
  <>
    
    <option value='workstation' label='Workstation' />
    
    
    <option value='server' label='Server' />
    
    
    <option value='desktop' label='Desktop' />
    
    
    <option value='laptop' label='Laptop' />
    
    
    <option value='device' label='Device' />
    
  </>
  )
};



/*

lowercase prioritylevellookup
uppercase PRIORITYLEVELLOOKUP
snakecase priority_level_lookup
pascalcase PriorityLevelLookup
camelcase priorityLevelLookup
kebabcase priority-level-lookup


*/

const PriorityLevelLookup = () => { 
  return(
  <>
    
    <option value='low' label='Low' />
    
    
    <option value='medium' label='Medium' />
    
    
    <option value='high' label='High' />
    
    
    <option value='critical' label='Critical' />
    
  </>
  )
};






export default BackupConfigForm;