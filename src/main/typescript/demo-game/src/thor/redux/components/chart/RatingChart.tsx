import React, { useState, useEffect, useRef } from 'react';
import { DataObject, Rating } from '../../../model';
import { useGetRatingsQuery, useAddRatingMutation, useUpdateRatingMutation } from '../../services/RatingService';
import TimeSeriesChart from "../../../../components/Charts/TimeSeriesChart";
import { Spinner } from 'react-bootstrap';
/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelChart.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Rating

  @author John McMahon ~ github: SpaceGhost69 | twitter: @TechnoCharms
  @see https://valkyrlabs.com/docs

*/
const fieldSkipList = ['ownerId', 'keyHash', 'workflowStateId', 'createdDate', 'lastAccessedById', 'lastAccessedDate', 'lastModifiedDate', 'lastModifiedById'];

const RatingChart: React.FC = () => {
  const { data: initialData = [], isLoading } = useGetRatingsQuery();

  const [data, setData] = useState<Rating[]>([]); // Array to hold table data
  const [chartData, setChartData] = useState<Partial<Rating>>({});
  const inputRef = useRef<HTMLInputElement | null>(null);
  const [showAllFields, setShowAllFields] = useState(false);

  useEffect(() => {
    if (initialData) {
      setData(initialData);
    }
  }, [initialData]);

  const handleInputChange = (field: string, value: any) => {
    setChartData((prev) => ({
      ...prev,
      [field]: value,
    }));
  };

  const renderValue = (value: any) => {
    if (value === null || value === undefined) {
      return '';
    }
    if (typeof value === 'object') {
      return JSON.stringify(value, null, 2);
    }
    return value;
  };

  return (
    <>
          {isLoading ? (
            <Spinner animation="border" />
          ) : (
            <TimeSeriesChart data={data.flatMap((rating: DataObject) => [rating])} />
          )}
    </>
  );
};

export default RatingChart;
