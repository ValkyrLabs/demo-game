import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { MediaObject, MediaObjectTypeEnum,  } from '../../../model';
import { useAddMediaObjectMutation } from '../../services/MediaObjectService';

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

Description: MediaObject
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const TypeValidation = () => { 
  return(
    [
      'Image', 'Audio', 'Video', 'Shape', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     sheetId: Yup.string()
    
    
    
    
    ,
     type: Yup.string().oneOf(TypeValidation(), 'Invalid value selected for type')
    
    
    
    
    ,
     url: Yup.string()
    
    
    
    
    ,
     positionRow: Yup.number()
    
    
    
    
    ,
     positionCol: Yup.number()
    
    
    
    
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

const MediaObjectForm: React.FC = () => {
  const [addMediaObject, addMediaObjectResult] = useAddMediaObjectMutation();

  const initialValues: MediaObject = {
    
    
    sheetId : 'null',
    
    
    
    
    
        type :   MediaObjectTypeEnum[Object.keys(MediaObjectTypeEnum)[0]], 
    
    
    url : 'null',
    
    
    
    
    
    
    
    
    
    positionRow : 0, 
    
    
    
    
    
    
    
    positionCol : 0, 
    
    
    
    
    
    id : '43b2b16d-35e4-4377-8c67-10cdd487e797',
    
    
    
    
    
    
    
    ownerId : '138851ea-166d-4c45-b31f-1871ef3ea5a0',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : '4bb3ed62-70d2-4b87-a268-fa13ef8447cd',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '3540c22f-93d9-45ab-8951-35d2ae8244b4',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<MediaObject>) => {
    setTimeout(() => {
      console.log(values);
      addMediaObject(values);
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
                          addMediaObjectResult: {JSON.stringify(addMediaObjectResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New MediaObject</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="sheetId" className="nice-form-control">
              <b>Sheet Id: {touched.sheetId && !errors.sheetId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* sheetId  TEXT FIELD */}
              <Field name="sheetId" type="text"
                className={errors.sheetId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="sheetId" component="span" />
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


        
            <label htmlFor="url" className="nice-form-control">
              <b>Url: {touched.url && !errors.url && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* url  TEXT FIELD */}
              <Field name="url" type="text"
                className={errors.url  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="url" component="span" />
            </label>


        
            <label htmlFor="position:-row" className="nice-form-control">
              <b>Position : - row: {touched.positionRow && !errors.positionRow && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*position:-row INTEGER FIELD */}
              <Field name="positionRow" type="text"
                className={errors.positionRow  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="positionRow" component="span" />
            </label>


        
            <label htmlFor="position-col" className="nice-form-control">
              <b>Position - col: {touched.positionCol && !errors.positionCol && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*position-col INTEGER FIELD */}
              <Field name="positionCol" type="text"
                className={errors.positionCol  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="positionCol" component="span" />
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
                      <FaCheckCircle size={30} /> Create New MediaObject
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
    
    <option value='Image' label='Media Image' />
    
    
    <option value='Audio' label='Media Audio' />
    
    
    <option value='Video' label='Media Video' />
    
    
    <option value='Shape' label='Media Shape' />
    
  </>
  )
};






export default MediaObjectForm;